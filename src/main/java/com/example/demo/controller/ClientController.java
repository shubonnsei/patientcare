package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	
	@RequestMapping("/patient/{id}")
	public Patient getPatientById(@PathVariable("id") long id) {
		return patientService.getPatientById(id);
		
	}
	
	@RequestMapping("/patients")
	public List<Patient> getPatients() {
		return patientService.getPatients();
	}
	
	@PutMapping("/patient")
	public Patient updatePatients(@RequestBody Patient patient) {
		return patientService.updatePatient(patient);
	}

	@DeleteMapping("patient/{id}")
	public String deletePatients(@PathVariable("id") long id) {
		patientService.deletePatient(id);
		return "Patient deleted";
	}
}
