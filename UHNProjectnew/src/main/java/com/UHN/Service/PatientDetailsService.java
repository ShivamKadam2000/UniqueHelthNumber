package com.UHN.Service;

import java.util.List;

import com.UHN.entities.PatientDetails;


public interface PatientDetailsService {
	
	public PatientDetails addPatientDetails(PatientDetails pt);

	public List<PatientDetails> getAllPatientDetails();

	public PatientDetails getPatientDetailsById(int id);

	public String deletePatientDetails(int id);

	public PatientDetails updatePatientDetails(PatientDetails pt);
	

}
