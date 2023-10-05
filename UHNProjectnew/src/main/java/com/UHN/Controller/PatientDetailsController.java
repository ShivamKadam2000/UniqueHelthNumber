package com.UHN.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.UHN.Service.PatientDetailsService;
import com.UHN.entities.PatientDetails;

@RestController
public class PatientDetailsController {
	
	@Autowired
	PatientDetailsService patientDetailsService;
	
	@PostMapping("/PatientDetails")
	public PatientDetails addNewPatientDetails(@RequestBody PatientDetails pt) {
		return patientDetailsService.addPatientDetails(pt);
		
	}
	@GetMapping("/PatientDetails")
	public List<PatientDetails>getAllPateintDetails(){
		return patientDetailsService.getAllPatientDetails();
		
	}
	@GetMapping("/PatientDetails/ {id}")
	public PatientDetails getPatientDetailsById(@PathVariable int id) {
		return patientDetailsService.getPatientDetailsById(id);
		
	}
	@DeleteMapping("/PatientDetails/ {id}")
	public String deletePatientDetails(@PathVariable int id) {
		return patientDetailsService.deletePatientDetails(id);
		
		
	}
	@PutMapping("/PatientDetails")
	public PatientDetails updatePatientDetails(@RequestBody PatientDetails pt) {
		return patientDetailsService.updatePatientDetails(pt);
		
	}
	
	
}
