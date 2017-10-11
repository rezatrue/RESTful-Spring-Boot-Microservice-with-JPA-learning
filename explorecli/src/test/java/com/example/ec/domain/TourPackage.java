package com.example.ec.domain;

import javax.persistence.Column;
import javax.persistence.Id;

public class TourPackage {
	@Id
	private String code;
	@Column
	private String name;
	
	protected TourPackage() {
	}

	public TourPackage(String code, String name) {
		super();
		this.code = code;
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "TourPackage { code= '" + code + "', name='" + name + "'}";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
	
	
	
	
}
