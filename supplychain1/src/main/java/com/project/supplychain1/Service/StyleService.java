package com.project.supplychain1.Service;

import java.util.List;

import com.project.supplychain1.model.Style;

public interface StyleService {

	List<Style> findAll();

	String addStyles(Style style);

}
