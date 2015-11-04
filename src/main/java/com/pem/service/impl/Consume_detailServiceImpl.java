package com.pem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pem.dao.Consume_detailMapping;
import com.pem.entity.Consume_detail;
import com.pem.service.Consume_detailService;
@Service(value="consume_detailService")
public class Consume_detailServiceImpl    implements Consume_detailService {

	@Autowired
	private Consume_detailMapping  consume_detailMapping;
	
	public List<Consume_detail> getAll(int begin, int pageSize) {
		return  consume_detailMapping.getAll(begin,pageSize);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return  consume_detailMapping.getCount();
	}

	@Override
	public void add(Consume_detail consume_detail) {
		// TODO Auto-generated method stub
		consume_detailMapping.add(consume_detail);
	}


}
