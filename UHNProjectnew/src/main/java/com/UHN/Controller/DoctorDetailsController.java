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

import com.UHN.Service.DoctorDetailsService;
import com.UHN.entities.DoctorDetails;

@RestController
public class DoctorDetailsController {
	
	@Autowired
	DoctorDetailsService doctorDetailsService;
	
	@PostMapping("/DoctorDetails")
	public DoctorDetails addNewDoctorDetails(@RequestBody DoctorDetails dr) {
		return doctorDetailsService.addDoctorDetails(dr);
		
	}
    @GetMapping("/DoctorDetails")
    public List<DoctorDetails> getAllDoctorDetails(){
    	return doctorDetailsService.getAllDoctorDetails();
    	
    }
    @GetMapping("/DoctorDetails/ {id}")
    public DoctorDetails getDoctorDetailsById(@PathVariable int id) {
    	return doctorDetailsService.getDoctorDetailsById(id);
    	
    }
    @DeleteMapping("/DoctorDetails/ {id}")
    public String deleteDoctorDetails(@PathVariable int id) {
    	return doctorDetailsService.deleteDoctorDetails(id);
    	
    }
    @PutMapping("/DoctorDetails")
    public DoctorDetails updateDoctorDetails(@RequestBody DoctorDetails dr) {
    	return doctorDetailsService.updateDoctorDetails(dr);
    }
}
