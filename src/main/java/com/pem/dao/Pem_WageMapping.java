package com.pem.dao;

import java.util.List;

import com.pem.entity.Pem_Wage;

public interface Pem_WageMapping {
	public List<Pem_Wage> getAll();
	public void add(Pem_Wage  wage);
}
