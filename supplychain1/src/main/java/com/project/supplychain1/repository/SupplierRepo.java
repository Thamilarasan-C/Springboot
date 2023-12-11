package com.project.supplychain1.repository;


import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.project.supplychain1.model.Supplier;

@Repository
public interface SupplierRepo extends MongoRepository<Supplier,String>{
}
