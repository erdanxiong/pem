package com.pem.entity;

import java.util.Date;

/**
 * 
 * @author zhangjin 工资发放记录实体
 */
public class Pem_Wage {
	private Integer id;
	private Integer user_id;
	private Integer bankId;
	private Integer sum;
	private Date wage_date;

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

	public Integer getBankId() {
		return bankId;
	}

	public void setBankId(Integer bankId) {
		this.bankId = bankId;
	}

	public Integer getSum() {
		return sum;
	}

	public void setSum(Integer sum) {
		this.sum = sum;
	}

	public Date getWage_date() {
		return wage_date;
	}

	public void setWage_date(Date wage_date) {
		this.wage_date = wage_date;
	}

}
