package com.project.supplychain1.model;

import lombok.Data;

@Data
public class Facility {
    private String id;
    private String name;
    private String suppliername;
    private String location;
    private String createdBy;
}