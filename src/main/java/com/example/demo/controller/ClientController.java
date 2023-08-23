package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Patient;
import com.example.demo.service.PatientService;

@RestController
public class ClientController {
	@Autowired
	private PatientService patientService;
	
	@RequestMapping("/")
	public String hello_world() {
		return "hello world!";
	}
	
	@PostMapping("/add")
	public String addPatient(@RequestBody Patient patient) {
		patientService.addPatient(patient);
		return "Patient added successfully.";
	}

}
