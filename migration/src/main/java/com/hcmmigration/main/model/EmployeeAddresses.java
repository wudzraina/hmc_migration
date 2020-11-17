package com.hcmmigration.main.model;

import java.util.List;

import com.hcmmigration.main.model.EmployeeAddress;

public class EmployeeAddresses {
 

    private List<EmployeeAddress> EmpAddress ;
     
	
	public List<EmployeeAddress>  getEmployeeAddressList() {
		return EmpAddress;
	}

	public void setEmployeeAddressList(List<EmployeeAddress>  emp){
		 this.EmpAddress = emp;
	} 
 
 
}
 
