package com.pem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pem.dao.Pem_Bank_Runing_WaterMapping;
import com.pem.entity.Pem_Bank_Running_Water;
import com.pem.service.Pem_Bank_Running_WaterService;
@Service(value="pem_Bank_Running_WaterService")
public class Pem_Bank_Runing_WaterServiceImpl  implements Pem_Bank_Running_WaterService {

	@Autowired
	private Pem_Bank_Runing_WaterMapping  bank_running_waterMapping;
	
	@Override
	public List<Pem_Bank_Running_Water> getAll() {
		// TODO Auto-generated method stub
		return bank_running_waterMapping.getAll();
	}

	@Override
	public void add(Pem_Bank_Running_Water bank_running_water) {
		// TODO Auto-generated method stub
		bank_running_waterMapping.add(bank_running_water);
	}

}
