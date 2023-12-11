package com.project.supplychain1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Facility")
public class FacilityController {
	@Autowired
    private FacilityService facilityService;
    
}
