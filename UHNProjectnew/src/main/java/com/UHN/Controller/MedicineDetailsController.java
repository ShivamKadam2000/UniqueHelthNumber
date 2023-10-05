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

import com.UHN.Service.MedicineDetailsService;
import com.UHN.entities.MedicineDetails;

@RestController
public class MedicineDetailsController {
	
	@Autowired
	MedicineDetailsService medicineDetailsService;
	
	@PostMapping("/MedicineDetails")
	public MedicineDetails addNewMediceDetails(@RequestBody MedicineDetails md) {
		return medicineDetailsService.addMedicineDetails(md);
		
	}
	@GetMapping("/MedicineDetails")
	public List<MedicineDetails> getAllMedicineDetails(){
		return medicineDetailsService.getAllMedicineDetails();
		
	}
	@GetMapping("/MedicineDetails/ {id}")
	public MedicineDetails getMedicineDetailsById(@PathVariable int id) {
		return medicineDetailsService.getMedicineDetailsById(id);
		
	}
	@DeleteMapping("/MedicineDetails/ {id}")
	public String deleteMedicineDetails(@PathVariable int id) {
		return medicineDetailsService.deleteMedicineDetails(id);
		
	}
	@PutMapping("/MedicineDetails")
	public MedicineDetails updateMedicineDetails(@RequestBody MedicineDetails md) {
		return medicineDetailsService.updateMedicineDetails(md);
		
	}

}
