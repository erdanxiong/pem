package com.pem.entity;

import java.util.Date;

public class Pem_Bank_Running_Water {
	private Integer id;
	private Integer user_id;
	private String running_name;
	private Double sum;
	private Integer status;
	private Double bank_balance;
	private int bank_id;
	private Date water_date;

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

	public String getRunning_name() {
		return running_name;
	}

	public void setRunning_name(String running_name) {
		this.running_name = running_name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Double getBank_balance() {
		return bank_balance;
	}

	public void setBank_balance(Double bank_balance) {
		this.bank_balance = bank_balance;
	}

	public int getBank_id() {
		return bank_id;
	}

	public void setBank_id(int bank_id) {
		this.bank_id = bank_id;
	}

	public Date getWater_date() {
		return water_date;
	}

	public void setWater_date(Date water_date) {
		this.water_date = water_date;
	}

}
