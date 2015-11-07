package com.pem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pem.dao.Pem_Take_MoneyMapping;
import com.pem.entity.Pem_Take_Money;
import com.pem.service.Pem_Take_MoneyService;
@Service(value="pem_Take_MoneyService")
public class Pem_Take_MoneyServiceImpl   implements   Pem_Take_MoneyService{

	@Autowired
	private Pem_Take_MoneyMapping   pem_Take_MoneyService ;
	
	@Override
	public List<Pem_Take_Money> getAll() {
		// TODO Auto-generated method stub
		return pem_Take_MoneyService.getAll();
	}

	@Override
	public void add(Pem_Take_Money take_Money) {
		// TODO Auto-generated method stub
		pem_Take_MoneyService.add(take_Money);
	}

}	
