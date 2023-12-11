package com.project.supplychain1.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.project.supplychain1.model.Style;

public interface StyleRepo extends MongoRepository<Style,String> {

}
