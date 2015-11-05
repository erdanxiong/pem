package com.pem.dao;

import java.util.List;

import com.pem.entity.Pem_bank;

public interface Pem_bankMapping {
	public List<Pem_bank> getAll();
	public void addBank(Pem_bank  bank);
}
