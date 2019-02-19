package com.basic.bean;

import java.math.BigDecimal;

public class CurrencyConvBean {


	
	private BigDecimal quantity;
	private BigDecimal calAmt;
	private int port;
	
	private Long id;
	private String froom;
	private String too;
	private BigDecimal conversionMultiple;
	
	
	public CurrencyConvBean() {
		
		
	}


	public CurrencyConvBean(BigDecimal quantity, BigDecimal calAmt, int port, Long id, String froom, String too,
			BigDecimal conversionMultiple) {
		super();
		this.quantity = quantity;
		this.calAmt = calAmt;
		this.port = port;
		this.id = id;
		this.froom = froom;
		this.too = too;
		this.conversionMultiple = conversionMultiple;
	}


	public BigDecimal getQuantity() {
		return quantity;
	}


	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}


	public BigDecimal getCalAmt() {
		return calAmt;
	}


	public void setCalAmt(BigDecimal calAmt) {
		this.calAmt = calAmt;
	}


	public int getPort() {
		return port;
	}


	public void setPort(int port) {
		this.port = port;
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


	public void setFroom(String froom) {
		this.froom = froom;
	}


	public String getToo() {
		return too;
	}


	public void setToo(String too) {
		this.too = too;
	}


	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}


	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}


	@Override
	public String toString() {
		return "CurrencyConvBean [quantity=" + quantity + ", calAmt=" + calAmt + ", port=" + port + ", id=" + id
				+ ", froom=" + froom + ", too=" + too + ", conversionMultiple=" + conversionMultiple + "]";
	}
	
	
	
}
