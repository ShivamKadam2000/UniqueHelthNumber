package com.UHN.Service;

import java.util.List;

import com.UHN.entities.MedicineDetails;



public interface MedicineDetailsService {
	
	public MedicineDetails addMedicineDetails(MedicineDetails md);

	public List<MedicineDetails> getAllMedicineDetails();

	public MedicineDetails getMedicineDetailsById(int id);

	public String deleteMedicineDetails(int id);

	public MedicineDetails updateMedicineDetails(MedicineDetails md);
	

}
