package com.stone.core.work.entity;

import java.io.Serializable;

public class Car implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2160905475628267119L;
	private long id;
	private long carNo;
	private String carName;
	private String carMode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCarName() {
		return carName;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarMode() {
		return carMode;
	}
	public void setCarMode(String carMode) {
		this.carMode = carMode;
	}
	public long getCarNo() {
		return carNo;
	}
	public void setCarNo(long carNo) {
		this.carNo = carNo;
	}

}
