package com.stone.core.work.test.cache;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cache.Cache;

import com.taobao.tair.DataEntry;
import com.taobao.tair.Result;
import com.taobao.tair.ResultCode;
import com.taobao.tair.TairManager;
import com.taobao.tair.impl.DefaultTairManager;

/**
 * 
 * @author linco lee
 */
public class TairCache implements Cache {
	Logger log = LoggerFactory.getLogger(TairCache.class);

	@Resource
	private TairManager tairManager;

	// @Resource
	// private MultiClusterTairManager tairManager;

	private int nameSpace;

	public void setNameSpace(int nameSpace) {
		this.nameSpace = nameSpace;
	}

	private String name = "default";//给cache起个名字，默认是default，也可以在spring配置文件中配

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// @Override
	// public MultiClusterTairManager getNativeCache() {
	// return tairManager;
	// }

	@Override
	public TairManager getNativeCache() {
		return tairManager;
	}

	@Override
	public TairResult get(Object key) {
		log.info(key+"=====get()====");
		Result<DataEntry> result = tairManager.get(nameSpace, (Serializable) key);
		
		if (result != null) {
			if (result.isSuccess() && result.getValue() != null) {
				TairResult tr = new TairResult();
				tr.put((Serializable) result.getValue().getValue());
				log.info(result.getValue().toString());
				return tr;
			} else {
				log.warn(result.isSuccess() ? "从Tair取出的value为空[key="+key+"]" : result.getRc().getMessage());
			}
		}
		return null;
	}

	@Override
	public void put(Object key, Object value) {
		log.info(key+"=====put()===="+value);
		if (key != null || value != null) {
			if (key instanceof TairKey) {
				TairKey tairKey = (TairKey) key;
				this.isRcSuccess(this.tairManager.put(nameSpace, tairKey.getKey(), (Serializable) value, tairKey.getVersion(), tairKey.getTime()));
			}
			this.isRcSuccess(this.tairManager.put(nameSpace, (Serializable) key, (Serializable) value));
		}

	}

	// 清除缓存
	@Override
	public void evict(Object key) {
		ResultCode rc = this.tairManager.delete(nameSpace, (Serializable) key);
		this.isRcSuccess(rc);
	}

	// tair返回是否成功
	public boolean isRcSuccess(ResultCode rc) {
		if (rc != null) {
			if (rc.isSuccess()) {
				return true;
			} else {
				log.warn(rc.getMessage());
				return false;
			}
		}
		log.warn("获取不到ResultCode");
		return false;
	}

	// 本来是删除所有缓存方法，但是这里禁止掉。
	@Override
	public void clear() {
		System.out.println("not allow to clear");
	}
}

