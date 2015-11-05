package com.pem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pem.dao.Pem_bankMapping;
import com.pem.entity.Pem_bank;
import com.pem.service.Pem_bankService;
@Service(value="pem_bankService")
public class Pem_bankServiceImpl implements Pem_bankService {
	@Autowired
	private Pem_bankMapping   pem_bankMapping;
	
	@Override
	public List<Pem_bank> getAll() {
		return pem_bankMapping.getAll();
	}

	@Override
	public void addBank(Pem_bank bank) {
		pem_bankMapping.addBank(bank);
		
	}

}
