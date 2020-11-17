package com.hcmmigration.main.model;



public class EmployeeName {

	private int empId = 1016;
	private String FirstName = "Nataraja Gootooru";
	private String LastName = "Programmer";
	
	@Override
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("************************************");
		sb.append("\nempId: ").append(empId);
		sb.append("\nFirstName: ").append(FirstName);
		sb.append("\nLastName: ").append(LastName);
		sb.append("\n************************************");
		return sb.toString();
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName= FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastname) {
		this.LastName = lastname;
	}
 
}
 
