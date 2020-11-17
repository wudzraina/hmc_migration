package com.hcmmigration.main.model;


import java.util.ArrayList;
import java.util.List;

public class EmployeePhone {


	private String Company = "Glober Telecom";
	private String Number = "0123456789";

	private List<EmployeePhone> phoneList;
    private ArrayList<String> phoneNoList;;

	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("************************************");
		sb.append("\nCompany: ").append(Company);
		sb.append("\nNumber: ").append(Number);
		sb.append("\n************************************");
		return sb.toString();
	}
	
 


	public ArrayList<String>  getPhoneArrayList() {
		return phoneNoList;
	}

	public void setPhoneArrayList( ArrayList<String> phoneArr) {
		this.phoneNoList= phoneArr;
	}
 

	public List<EmployeePhone> getPhoneList() {
		return phoneList;
	}

	public void setPhoneList(List<EmployeePhone> phoneList) {
		this.phoneList= phoneList;
	}
 


	public String getCompany() {
		return Company;
	}

	public void setCompany(String company) {
		this.Company= company;
	}
 


	public String getNumber() {
		return Number;
	}

	public void setName(String number) {
		this.Number = number;
	}
 
}
 
