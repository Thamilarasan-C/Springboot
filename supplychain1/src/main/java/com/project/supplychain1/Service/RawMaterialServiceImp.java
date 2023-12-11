package com.project.supplychain1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.supplychain1.model.RawMaterial;
import com.project.supplychain1.repository.RawMaterialRepo;

@Service
public class RawMaterialServiceImp implements RawMaterialService{

	@Autowired
	private RawMaterialRepo rawMaterialRepo;
	@Override
	public String addRawMaterial(RawMaterial rawMaterial) {
		rawMaterialRepo.save(rawMaterial);
		return "RawMaterial added";
	}
	@Override
	public List<RawMaterial> getRawMaterials() {
		return rawMaterialRepo.findAll();
	}

}
