package com.basic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.basic.model.CurrencyExch;

public interface CurrencyExchRepository extends JpaRepository<CurrencyExch, Long>{

	
	CurrencyExch findByFroomAndToo(String from,String to);
}
