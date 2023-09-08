package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Patient;

public interface PatientService {
	
	public Patient addPatient(Patient patient); 

	public Patient getPatientById(long id); 
	
	public List<Patient> getPatients();
	
	public void deletePatient(long id);
	
	public Patient updatePatient(Patient patient);
}
