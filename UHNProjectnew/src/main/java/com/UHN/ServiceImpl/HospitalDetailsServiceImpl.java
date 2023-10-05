package com.UHN.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UHN.Repo.HospitalDetailsRepository;
import com.UHN.Service.HospitalDetailsService;
import com.UHN.entities.HospitalDetails;

@Service
public class HospitalDetailsServiceImpl implements HospitalDetailsService {

	
	
	@Autowired
	HospitalDetailsRepository hospitalDetailsRepository;
	
	
	@Override
	public HospitalDetails addHospitalDetails(HospitalDetails hp) {
		// TODO Auto-generated method stub
		return hospitalDetailsRepository.save(hp);
	}

	@Override
	public List<HospitalDetails> getAllHospitalDetails() {
		// TODO Auto-generated method stub
		return hospitalDetailsRepository.findAll();
	}

	@Override
	public HospitalDetails getHospitalDetailsById(int id) {
		// TODO Auto-generated method stub
		return hospitalDetailsRepository.findById(id).get();
	}

	@Override
	public String deleteHospitalDetails(int id) {
		// TODO Auto-generated method stub
		 hospitalDetailsRepository.deleteById(id);
		 return "hospitalDetails deleted";
		 
	}

	@Override
	public HospitalDetails updateHospitalDetails(HospitalDetails hp) {
		// TODO Auto-generated method stub
		return null;
	}

}
