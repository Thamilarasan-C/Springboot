package com.project.supplychain1.Service;

import java.util.List;

import com.project.supplychain1.model.RawMaterial;

public interface RawMaterialService {

	String addRawMaterial(RawMaterial rawMaterial);

	List<RawMaterial> getRawMaterials();

}
