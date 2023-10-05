package com.UHN.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UHN.Repo.DoctorDetailsRepository;
import com.UHN.Service.DoctorDetailsService;
import com.UHN.entities.DoctorDetails;

@Service
public class DoctorDetailsServiceImpl implements DoctorDetailsService{

	
	@Autowired
	DoctorDetailsRepository doctorDetailsRepository;
	
	@Override
	public DoctorDetails addDoctorDetails(DoctorDetails dr) {
		// TODO Auto-generated method stub
		return doctorDetailsRepository.save(dr);
	}

	@Override
	public List<DoctorDetails> getAllDoctorDetails() {
		// TODO Auto-generated method stub
		return doctorDetailsRepository.findAll();
	}

	@Override
	public DoctorDetails getDoctorDetailsById(int id) {
		// TODO Auto-generated method stub
		return doctorDetailsRepository.findById(id).get();
	}

	@Override
	public String deleteDoctorDetails(int id) {
		// TODO Auto-generated method stub
		doctorDetailsRepository.deleteById(null);
		return "doctorDetails deleted";
	}

	@Override
	public DoctorDetails updateDoctorDetails(DoctorDetails dr) {
		// TODO Auto-generated method stub
		return null;
	}

}
