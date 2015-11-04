package com.pem.entity;

import java.util.Date;
/**
 * 消费详情记录表对应实体
 * 
 * @author zhangjin
 *
 */
public class Consume_detail {
	private int id;
	// 对应用户id
	private Integer user_id;
	// 消费名称
	private String consume_name;
	// 消费金额
	private Double consume_sum;
	// 消费时间
	private Date comsume_date;
	// 消费地点
	private String consume_address;
	// 消费原因
	private String consume_reason;
	// 记录录入地址
	private String record_id;
	// 是否是必要字段
	private Integer isNeed;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public String getConsume_name() {
		return consume_name;
	}

	public void setConsume_name(String consume_name) {
		this.consume_name = consume_name;
	}

	public Double getConsume_sum() {
		return consume_sum;
	}

	public void setConsume_sum(Double consume_sum) {
		this.consume_sum = consume_sum;
	}

	public Date getComsume_date() {
		return comsume_date;
	}

	public void setComsume_date(Date comsume_date) {
		this.comsume_date = comsume_date;
	}

	public String getConsume_address() {
		return consume_address;
	}

	public void setConsume_address(String consume_address) {
		this.consume_address = consume_address;
	}

	public String getConsume_reason() {
		return consume_reason;
	}

	public void setConsume_reason(String consume_reason) {
		this.consume_reason = consume_reason;
	}

	public String getRecord_id() {
		return record_id;
	}

	public void setRecord_id(String record_id) {
		this.record_id = record_id;
	}

	public Integer getIsNeed() {
		return isNeed;
	}

	public void setIsNeed(Integer isNeed) {
		this.isNeed = isNeed;
	}

}
