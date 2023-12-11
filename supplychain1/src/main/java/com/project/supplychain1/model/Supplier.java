package com.project.supplychain1.model;

import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
@Data
@Document(collection="supplier")
public class Supplier {
	@Id
	private String id;
	private String name;
	private String address;
	private String email;
	private int tierNo;
	public String website;
	
	
	
	public Supplier(String name, String address, String email, int tierNo, String website) {
		super();
		this.name = name;
		this.address = address;
		this.email = email;
		this.tierNo = tierNo;
		this.website = website;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getTierNo() {
		return tierNo;
	}
	public void setTierNo(int tierNo) {
		this.tierNo = tierNo;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
}
