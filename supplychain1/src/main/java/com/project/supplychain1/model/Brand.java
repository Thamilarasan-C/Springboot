package com.project.supplychain1.model;

import org.springframework.data.annotation.Id;

import lombok.Data;
@Data
public class Brand {
	@Id
	private String brandId;
    private String name;
    private String parentCompany;
    private  String website;
}
