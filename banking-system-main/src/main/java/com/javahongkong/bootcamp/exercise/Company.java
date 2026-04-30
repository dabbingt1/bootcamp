package com.javahongkong.bootcamp.exercise;

public class Company extends AccountHolder {
	private String companyName;
	private int taxId;

	public Company(String companyName, int taxId) {
		// complete the function
		super(taxId); 
		if (companyName == null)
			throw new IllegalArgumentException("company name missing");
		this.companyName = companyName;
		this.taxId = taxId;
	}

	public String getCompanyName() {
		// complete the function
		return this.companyName;
	
	}

	@Override
	public int idNumber() {
		return this.taxId;
	}
}
