package com.pem.service;

import java.util.List;

import com.pem.entity.Consume_detail;

public interface Consume_detailService {
	public List<Consume_detail>  getAll(int begin, int pageSize);

	public int getCount();

	public void add(Consume_detail consume_detail);
}
