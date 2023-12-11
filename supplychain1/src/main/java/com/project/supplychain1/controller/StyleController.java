package com.project.supplychain1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.supplychain1.Service.StyleService;
import com.project.supplychain1.model.Style;
import com.project.supplychain1.model.Supplier;

@RestController
@RequestMapping("/Style")
public class StyleController {

	@Autowired
	private StyleService styleService;
	
	@GetMapping()
	public List<Style> getStyles() {
        return styleService.findAll();
    }
	
	@PostMapping("/addStyle")
	public String addStyles(@RequestBody Style style) {
		return styleService.addStyles(style);
	}
}