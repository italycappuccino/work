package com.stone.core.work.entity;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public @Data class Mountain {
	
	
	
	private Long id;
	private String name;
	
	public void abc(){
		log.info("==============slf4j");
	}

}
