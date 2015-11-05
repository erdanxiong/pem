package com.pem.service;

import java.util.List;

import com.pem.entity.Pem_bank;

public interface Pem_bankService {
	public List<Pem_bank> getAll();
	public void addBank(Pem_bank  bank);
}
