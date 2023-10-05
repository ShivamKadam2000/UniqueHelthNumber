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

import com.UHN.Service.DiseaseDetailsService;
import com.UHN.entities.DiseaseDetails;

@RestController
public class DiseaseDetailsController {
	
	@Autowired
	DiseaseDetailsService  diseaseDetailsService;
	
	@PostMapping("/DiseaseDetails")
	public DiseaseDetails addNewDiseaseDetails(@RequestBody DiseaseDetails di){
		return diseaseDetailsService.addDiseaseDetails(di);
	}
	
	@GetMapping("/DiseaseDetails")
	public List<DiseaseDetails> getAllDiseaseDetails(){
		return diseaseDetailsService.getAllDiseaseDetails();
		
	}
	@GetMapping("/DiseaseDetails/ {id}")
	public DiseaseDetails getDiseaseDetailsById(@PathVariable int id) {
		return diseaseDetailsService.getDiseaseDetailstById(id);		
	}
	@DeleteMapping("/DiseaseDetails/ {id}")
	public String deletDiseaseDetails(@PathVariable int id) {
		return diseaseDetailsService.deleteDiseaseDetails(id);
		
	}
	@PutMapping("/DiseaseDetails")
	public DiseaseDetails updateDiseaseDetails(@RequestBody DiseaseDetails di) {
		return diseaseDetailsService.updateDiseaseDetails(di);
	}

}
