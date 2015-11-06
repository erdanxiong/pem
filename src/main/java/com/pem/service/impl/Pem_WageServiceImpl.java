package com.pem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.pem.entity.Pem_Wage;
import com.pem.service.Pem_WageService;

public class Pem_WageServiceImpl implements Pem_WageService {

	@Autowired
	private Pem_WageService pem_wageService;

	@Override
	public List<Pem_Wage> getAll() {
		// TODO Auto-generated method stub
		return pem_wageService.getAll();
	}

	@Override
	public void add(Pem_Wage wage) {
		// TODO Auto-generated method stub
		pem_wageService.add(wage);

	}

}
