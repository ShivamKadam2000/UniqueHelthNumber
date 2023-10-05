package com.UHN.Service;

import java.util.List;

import com.UHN.entities.HospitalDetails;



public interface HospitalDetailsService {
	public HospitalDetails addHospitalDetails(HospitalDetails hp);

	public List<HospitalDetails> getAllHospitalDetails();

	public HospitalDetails getHospitalDetailsById(int id);

	public String deleteHospitalDetails(int id);

	public HospitalDetails updateHospitalDetails(HospitalDetails hp);
	
}
