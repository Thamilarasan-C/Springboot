package com.project.supplychain1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.supplychain1.Service.RawMaterialService;
import com.project.supplychain1.model.RawMaterial;

@RestController
@RequestMapping("/RawMaterial")
public class RawMaterialController {
	@Autowired
	private RawMaterialService rawMaterialService;
	
	@GetMapping
	public List<RawMaterial> getRawMaterials(){
		return rawMaterialService.getRawMaterials();
	}
	
	@PostMapping("/addRawMaterial")
	public String addRawMaterial(@RequestBody RawMaterial rawMaterial) {
		return rawMaterialService.addRawMaterial(rawMaterial);
	}
}