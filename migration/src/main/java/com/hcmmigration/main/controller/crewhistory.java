package com.hcmmigration.main.controller;

import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
// import com.hcmmigration.main.utility.ch_csv;
// import m.hcmmigration.migration.model.crewhistorymodel;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
public class crewhistory {

	@GetMapping(value="hcmmigration/api/v1.0/crewhistory")
	public String getMethodName()
	{

		// ch_csv cv = new ch_csv();

		com.hcmmigration.main.model.crewhistory model = new com.hcmmigration.main.model.crewhistory();
		String json = model.toString() ;//+ " " + cv.toString() ;
		return json;

	}

	@GetMapping("hcmmigration/api/v1.0/crewhistory/download")
	public void downloadCSV(HttpServletResponse response) throws IOException
	{
		response.setContentType("text/csv");
		response.setHeader("Content-Disposition", "attachment; file=customers.csv");

		// List<Crewhistory> customers = (List<Crewhistory>) customerRepository.findAll();

		// Using method 1 ->
		// WriteDataToCSV.writeDataToCsvUsingStringArray(response.getWriter(), customers);

		// Using method 2 ->
		// WriteDataToCSV.writeDataToCsvWithListObjects(response.getWriter(), customers);
	}


}
