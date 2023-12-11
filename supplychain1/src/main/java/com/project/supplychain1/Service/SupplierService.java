package com.project.supplychain1.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.supplychain1.model.Supplier;



public interface SupplierService {

	String add(Supplier supplier);
	//List<Supplier> getSuppliers(String name);
	List<Supplier> findAll();
}
