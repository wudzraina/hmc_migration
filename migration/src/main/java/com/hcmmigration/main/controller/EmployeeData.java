package com.hcmmigration.main.controller;
 
import java.util.ArrayList;
import java.util.List;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.hcmmigration.main.model.EmployeeNames;
import com.hcmmigration.main.model.EmployeeName;

import com.hcmmigration.main.model.EmployeeAddresses;
import com.hcmmigration.main.model.EmployeeAddress;
import com.hcmmigration.main.model.EmployeePhone; 
 
@SpringBootApplication
@RestController
public class EmployeeData 
{
    private static Logger log = LoggerFactory.getLogger(EmployeeData.class);
 


	@RequestMapping(value="hcmmigration/api/v1.0/EmployeeData/test", method = RequestMethod.GET)
	public String getMethodName()
	{
	
		// ch_csv cv = new ch_csv();
		

		String json ="test APO";//+ " " + cv.toString() ;
		return json;

	}

    @RequestMapping(value = "hcmmigration/api/v1.0/EmployeeData/address", method = RequestMethod.GET)
    public EmployeeAddresses getAddresses() 
    {
        log.info("get addresses Start");
 
        EmployeeAddresses employeeAddressesList = new EmployeeAddresses();
 
        EmployeeAddress employeeAddress1 = new EmployeeAddress();
        EmployeeAddress employeeAddress2 = new EmployeeAddress();
         
        List<EmployeeAddress> addressList = new ArrayList<EmployeeAddress>();
        {
            employeeAddress1.setHouseNo("1111");
            employeeAddress1.setStreet("111");
            employeeAddress1.setZipCode("111111");
             
            employeeAddress2.setHouseNo("222");
            employeeAddress2.setStreet("222");
            employeeAddress2.setZipCode("222222");
             
            addressList.add(employeeAddress1);
            addressList.add(employeeAddress2);
             
            employeeAddressesList.setEmployeeAddressList(addressList);;
        }
 
        return employeeAddressesList;
    }
 
    @RequestMapping(value = "hcmmigration/api/v1.0/EmployeeData/phone", method = RequestMethod.GET)
    public EmployeePhone getPhoneNumbers() 
    {
        log.info("get phones Start");
 
        EmployeePhone employeePhone = new EmployeePhone();
        {
            ArrayList<String> phoneNumberList = new ArrayList<String>();
             
            phoneNumberList.add("100000");
            phoneNumberList.add("200000");
             
            employeePhone.setPhoneArrayList(phoneNumberList);
        }
 
        return employeePhone;
    }
 
    @RequestMapping(value = "hcmmigration/api/v1.0/EmployeeData/name", method = RequestMethod.GET)
    public EmployeeNames getEmployeeName() 
    {
        log.info("get names Start");
 
        EmployeeNames employeeNamesList = new EmployeeNames();
 
        EmployeeName employeeName1 = new EmployeeName();
        EmployeeName employeeName2 = new EmployeeName();
         
        List<EmployeeName> employeeList = new ArrayList<EmployeeName>();
        {
            employeeName1.setFirstName("Santa");
            employeeName1.setLastName("Singh");
        }
        {
            employeeName2.setFirstName("Banta");
            employeeName2.setLastName("Singh");
        }
 
        employeeList.add(employeeName1);
        employeeList.add(employeeName2);
 
        employeeNamesList.setEmployeeNameList(employeeList); 
 
        return employeeNamesList;
    }
}