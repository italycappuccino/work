package com.stone.core.work.entity;

import java.io.Serializable;

public class City extends Page implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3697390105893528976L;
	private Long id;
	private String name;
	private String countryCode;
	private String district;
	private String population;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getPopulation() {
		return population;
	}
	public void setPopulation(String population) {
		this.population = population;
	}

}
