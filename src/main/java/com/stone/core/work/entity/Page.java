package com.stone.core.work.entity;

import java.io.Serializable;

public class Page implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7162852269903284749L;
	public String order;
	public String by;
	public int start;
	public int limit;
	public String getOrder() {
		return order;
	}
	public void setOrder(String order) {
		this.order = order;
	}
	public String getBy() {
		return by;
	}
	public void setBy(String by) {
		this.by = by;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getLimit() {
		return limit;
	}
	public void setLimit(int limit) {
		this.limit = limit;
	}
}
