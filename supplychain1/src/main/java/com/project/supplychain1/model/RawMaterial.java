package com.project.supplychain1.model;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class RawMaterial {
	@Id
	private String materialId;
	private String materialName;
	private String type;
	private String materialComposition;
	private String supplierName;
	private String facilityId;
	public String getName() {
		return materialName;
	}
}