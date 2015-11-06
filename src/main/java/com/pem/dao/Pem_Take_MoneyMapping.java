package com.pem.dao;

import java.util.List;

import com.pem.entity.Pem_Take_Money;

public interface Pem_Take_MoneyMapping {
	public List<Pem_Take_Money>  getAll();

	public void add(Pem_Take_Money take_Money);
}
