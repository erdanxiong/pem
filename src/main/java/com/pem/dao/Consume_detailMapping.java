package com.pem.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.pem.entity.Consume_detail;

@Repository(value="consume_detailMapping")
public interface Consume_detailMapping {
	public List<Consume_detail>   getAll(@Param(value ="begin") int begin, @Param(value = "pageSize") int pageSize);

	public int getCount();

	public void add(Consume_detail consume_detail);   
}
