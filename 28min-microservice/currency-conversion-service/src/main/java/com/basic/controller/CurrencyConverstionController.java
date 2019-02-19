package com.basic.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.basic.bean.CurrencyConvBean;
import com.basic.feign.CurrencyExchangeProxySerive;

@RestController

public class CurrencyConverstionController {
	
	@Autowired
	CurrencyExchangeProxySerive currProxy;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/currency-convertor/from/{from}/to/{to}/quantity/{quantity}")
	CurrencyConvBean getConvValue(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity) {
		
		Map<String,String> uriVariable = new HashMap<>();
		uriVariable.put("from", from);
		uriVariable.put("to", to);
		
		 ResponseEntity<CurrencyConvBean> responseEntity= new RestTemplate().
				 getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConvBean.class, uriVariable);
		 CurrencyConvBean bean = responseEntity.getBody();
		 System.out.println(" converion multiply   "+bean.getConversionMultiple());
		return new CurrencyConvBean(quantity,quantity.multiply(bean.getConversionMultiple()),bean.getPort(), bean.getId(),from, to,
				bean.getConversionMultiple());
	}
	
	//Solve the above complexity using Feign to call external service
	
	@GetMapping("/currency-convertor-feign/from/{from}/to/{to}/quantity/{quantity}")
	CurrencyConvBean getConvValueFeigh(@PathVariable String from,@PathVariable String to, @PathVariable BigDecimal quantity) {
		 CurrencyConvBean bean = currProxy.getExchangeValue(from, to);
		 logger.info("---------UNIQUE ID---------",bean);
		 System.out.println(" converion multiply   "+bean.getConversionMultiple());
		return new CurrencyConvBean(quantity,quantity.multiply(bean.getConversionMultiple()),bean.getPort(), bean.getId(),from, to,
				bean.getConversionMultiple());
	}

}
