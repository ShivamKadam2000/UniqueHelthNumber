package com.UHN.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UHN.Repo.PatientDetailsRepository;
import com.UHN.Service.PatientDetailsService;
import com.UHN.entities.PatientDetails;

@Service
public class PatientDetailsServiceImpl implements PatientDetailsService {

	@Autowired
	 PatientDetailsRepository patientDetailsRepository;
	
	@Override
	public PatientDetails addPatientDetails(PatientDetails pt) {
		// TODO Auto-generated method stub
		return patientDetailsRepository.save(pt);
	
	}

	@Override
	public List<PatientDetails> getAllPatientDetails() {
		// TODO Auto-generated method stub
		return patientDetailsRepository.findAll();
	}

	@Override
	public PatientDetails getPatientDetailsById(int id) {
		// TODO Auto-generated method stub
		return patientDetailsRepository.findById(id).get();
	}

	@Override
	public String deletePatientDetails(int id) {
		// TODO Auto-generated method stub
		 patientDetailsRepository.deleteById(id);
		 return " patientDetails deleted";
	}

	@Override
	public PatientDetails updatePatientDetails(PatientDetails pt) {
		// TODO Auto-generated method stub
		return null;
	}

}
