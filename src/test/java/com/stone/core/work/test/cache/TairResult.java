package com.stone.core.work.test.cache;

import java.io.Serializable;

/**
 * 
 * @author linco lee
 */
public class TairResult<T extends Serializable> implements
		org.springframework.cache.Cache.ValueWrapper {
	private T result;

	/**
	 * Tair上的版本号
	 * 
	 */
	private int version;
	/**
	 * 存储时间，单位为秒
	 */
	private int time;

	@Override
	public Object get() {

		return result;
	}

	public void put(T rs) {
		this.result = rs;
	}
}