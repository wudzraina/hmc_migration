package com.hcmmigration.main.controller;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
 


import com.hcmmigration.main.model.EmployeeNames;
import com.hcmmigration.main.model.EmployeeAddresses;

import com.hcmmigration.main.model.EmployeePhone; 
 
@RestController
public class Async {
 
    private static Logger log = LoggerFactory.getLogger(Async.class);
 
    @Autowired
    private AsyncService service;
 
    @RequestMapping(value = "hcmmigration/api/v1.0/Asynch", method = RequestMethod.GET)
    public void testAsynch() throws InterruptedException, ExecutionException 
    {
        log.info("testAsynch Start");
 
        CompletableFuture<EmployeeAddresses> employeeAddress = service.getEmployeeAddress();
        CompletableFuture<EmployeeNames> employeeName = service.getEmployeeName();
        CompletableFuture<EmployeePhone> employeePhone = service.getEmployeePhone();
 
        // Wait until they are all done
        CompletableFuture.allOf(employeeAddress, employeeName, employeePhone).join();
        // CompletableFuture.allOf(employeeAddress).join();
        log.info("EmployeeAddress--> " + employeeAddress.get());
        log.info("EmployeeName--> " + employeeName.get());
        log.info("EmployeePhone--> " + employeePhone.get());




    }


	@RequestMapping(value="hcmmigration/api/v1.0/emp/Testmethod", method = RequestMethod.GET)
	public String getMethodName()
	{
	

		

		String json = "{ name:  [ { 'first_name' : 'Mudzraina', 'last_name' : 'Waludz' },  { 'first_name' : 'Wudzraina', 'last_name' : 'wali' }]}";
		return json;

	}
}