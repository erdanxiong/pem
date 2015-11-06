package com.pem.service;

import java.util.List;

import com.pem.entity.Pem_Bank_Running_Water;

public interface  Pem_Bank_Running_WaterService {
	public List<Pem_Bank_Running_Water> getAll();
	public void add(Pem_Bank_Running_Water  bank_running_water);
}	
