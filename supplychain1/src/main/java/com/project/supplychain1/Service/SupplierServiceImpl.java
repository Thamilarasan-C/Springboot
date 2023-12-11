package com.project.supplychain1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.supplychain1.model.Supplier;
import com.project.supplychain1.repository.SupplierRepo;

@Service
public class SupplierServiceImpl implements SupplierService{
    @Autowired
    private SupplierRepo supplierRepo;
	
	public String add(Supplier supplier) {
		supplierRepo.save(supplier);
		return "Supplier Added";
	}
	
	public List<Supplier> findAll() {
		return supplierRepo.findAll();
	}
}