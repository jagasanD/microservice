package com.basic.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CurrencyExch {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String froom;
	private String too;
	private BigDecimal conversionMultiple;
	private String port;
	
	public CurrencyExch() {
		
	}

	public CurrencyExch(Long id, String from, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.froom = from;
		this.too = to;
		this.conversionMultiple = conversionMultiple;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFroom() {
		return froom;
	}

	public void setFroom(String from) {
		this.froom = from;
	}

	public String getToo() {
		return too;
	}

	public void setToo(String to) {
		this.too = to;
	}

	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}

	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String string) {
		this.port = string;
	}

	@Override
	public String toString() {
		return "CurrencyExch [id=" + id + ", froom=" + froom + ", too=" + too + ", conversionMultiple="
				+ conversionMultiple + ", port=" + port + "]";
	}
	
	
}
