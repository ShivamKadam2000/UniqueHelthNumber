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

import com.UHN.Service.HospitalDetailsService;
import com.UHN.entities.HospitalDetails;

@RestController
public class HospitalDetailsController {

	@Autowired
	HospitalDetailsService hospitalDetailsService;
	
	@PostMapping("/HospitalDetails")
	public HospitalDetails addNewHospitalDetails(@RequestBody HospitalDetails hp) {
		return hospitalDetailsService.addHospitalDetails(hp);
		
	}
	@GetMapping("/HospitalDetails")
	public List<HospitalDetails> getAllHospitalDetails(){
		return hospitalDetailsService.getAllHospitalDetails();
	}
	@GetMapping("/HospitalDetails/ {id}")
	public HospitalDetails getHospitalDetailsById(@PathVariable int id) {
		return hospitalDetailsService.getHospitalDetailsById(id);
		
	}
	@DeleteMapping("/HospitalDetails/ {id}")
	public String deleteHospitalDetails(@PathVariable int id) {
		return hospitalDetailsService.deleteHospitalDetails(id);
		
	}
	@PutMapping("/HospitalDetails")
	public HospitalDetails updateHospitalDetails(@RequestBody HospitalDetails hp) {
		return hospitalDetailsService.updateHospitalDetails(hp);
		
	}
}
