package com.gi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.gi.entity.EmployeeEntity;
import com.gi.repository.EmployeeRepository;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository employeerepository;

	@PostMapping(value = "/addemployee", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public String addEmployeeDetails(@RequestBody EmployeeEntity e) {

		EmployeeEntity save = employeerepository.save(e);
		if (save == null)
			return "not added";
		else
			return "data added";
	}

}
