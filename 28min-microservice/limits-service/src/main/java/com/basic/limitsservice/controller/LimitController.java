package com.basic.limitsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.limitsservice.bean.ConfigureProperties;
import com.basic.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitController {

	@Autowired
	ConfigureProperties configProp;
	
	@GetMapping("/limits")
	public LimitConfiguration getConfiguration() {
		return new LimitConfiguration(configProp.getMaximum(),configProp.getMinimum());
	}
	
}
