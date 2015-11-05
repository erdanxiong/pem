package com.pem.entity;

import java.util.Date;

public class Pem_Take_Money {
	private Integer id;
	private Integer user_id;
	private String address;
	private Double sum;
	private Integer bank_id;
	private Date take_date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Integer getBank_id() {
		return bank_id;
	}

	public void setBank_id(Integer bank_id) {
		this.bank_id = bank_id;
	}

	public Date getTake_date() {
		return take_date;
	}

	public void setTake_date(Date take_date) {
		this.take_date = take_date;
	}

}
