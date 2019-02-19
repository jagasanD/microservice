package com.basic.controller;

import java.math.BigDecimal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.basic.model.CurrencyExch;
import com.basic.repository.CurrencyExchRepository;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	Environment environment;
	
	@Autowired
	CurrencyExchRepository currExchRepo;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
@GetMapping("/currency-exchange/from/{from}/to/{to}")
public CurrencyExch getExchangeValue(@PathVariable String from,@PathVariable String to) {
	CurrencyExch bean =currExchRepo.findByFroomAndToo(from,to);
	bean.setPort(environment.getProperty("local.server.port"));
	 logger.info("---------UNIQUE ID---------",bean);
	
	return bean;
}
	
}
