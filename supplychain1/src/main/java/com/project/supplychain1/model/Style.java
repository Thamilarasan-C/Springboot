package com.project.supplychain1.model;

import lombok.Data;

@Data
public class Style {
      private String name;
      private String StyleId;
      private String supplier;
      private String type;
      private String facilityName;
      private String materialComposition;
	public String getName() {
		return name;
	}
}
