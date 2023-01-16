package com.raauf.green.number.tunisia.models;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "business_numbers")
public class Business {
	@Id
	private String id;
	private String customer_name;
	private String category;
	private String business_description;
	private String phone;
	private Date created_at;
	private Date updated_at;

	public Business(String id, String customer_name, String category, String business_description,String phone, Date created_at, Date updated_at) {
		super();
		this.id = id;
		this.customer_name=customer_name;
		this.category=category;
		this.business_description=business_description;
		this.setPhone(phone);
		this.created_at = created_at;
		this.updated_at = updated_at;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCustomer_name() {
		return customer_name;
	}

	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}

	

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getBusiness_description() {
		return business_description;
	}

	public void setBusiness_description(String business_description) {
		this.business_description = business_description;
	}

	public Date getCreated_at() {
		return created_at;
	}

	public void setCreated_at(Date created_at) {
		this.created_at = created_at;
	}

	public Date getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(Date updated_at) {
		this.updated_at = updated_at;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
}
