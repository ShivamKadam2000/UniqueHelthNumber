package com.UHN.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UHN.Repo.MedicineDetailsRepository;
import com.UHN.Service.MedicineDetailsService;
import com.UHN.entities.MedicineDetails;

@Service
public class MedicineDetailsServiceImpl implements MedicineDetailsService{

	
	
	@Autowired
	MedicineDetailsRepository medicineDetailsRepository;
	
	@Override
	public MedicineDetails addMedicineDetails(MedicineDetails md) {
		// TODO Auto-generated method stub
		return medicineDetailsRepository.save(md);
	}

	@Override
	public List<MedicineDetails> getAllMedicineDetails() {
		// TODO Auto-generated method stub
		return medicineDetailsRepository.findAll();
	}

	@Override
	public MedicineDetails getMedicineDetailsById(int id) {
		// TODO Auto-generated method stub
		return medicineDetailsRepository.findAll().get(id);
	}

	@Override
	public String deleteMedicineDetails(int id) {
		// TODO Auto-generated method stub
		 medicineDetailsRepository.deleteById(id);
		 return "medicineDetails deleted";
		 
	}
	

	@Override
	public MedicineDetails updateMedicineDetails(MedicineDetails md) {
		// TODO Auto-generated method stub
		return null;
	}

}
