package com.example.demo.vo;

import java.sql.Timestamp;

import javax.persistence.Entity;

@Entity
public class CountryVO {
	
	private int country_id;
	private String country;
	private Timestamp last_update;
	
	
	public int getCountry_id() {
		return country_id;
	}
	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Timestamp getLast_update() {
		return last_update;
	}
	public void setLast_update(Timestamp last_update) {
		this.last_update = last_update;
	}
	
	

}
