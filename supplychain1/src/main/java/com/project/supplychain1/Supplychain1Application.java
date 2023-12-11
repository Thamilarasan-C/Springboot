package com.project.supplychain1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.supplychain1.model.Supplier;
import com.project.supplychain1.repository.SupplierRepo;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableMongoRepositories("com.project.supplychain1.repository")
public class Supplychain1Application{
	public static void main(String[] args) {
		SpringApplication.run(Supplychain1Application.class, args);
	}
	
    //@Bean
    //@RequestMapping("/supplierrecord")
//	CommandLineRunner runner(SupplierRepo supplierRepo) {
//		return args->{
//			Supplier supplier = new Supplier("NewTextiles","covai","newt@gmail.com",2,"newt.com");
//			supplierRepo.insert(supplier);
//			System.out.println("Hi");
//		};
//	}
}