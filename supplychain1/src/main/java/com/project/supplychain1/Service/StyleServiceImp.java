package com.project.supplychain1.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.supplychain1.model.Style;
import com.project.supplychain1.repository.StyleRepo;
@Service
public class StyleServiceImp implements StyleService{
	@Autowired
	private StyleRepo styleRepo;
	
	public List<Style> findAll() {
		return styleRepo.findAll();
	}
	
	public String addStyles(Style style) {
		styleRepo.save(style);
		return "Style added";
	}
}