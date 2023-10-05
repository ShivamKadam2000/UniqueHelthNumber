package com.UHN.Service;

import java.util.List;

import com.UHN.entities.DoctorDetails;



public interface DoctorDetailsService {
	public DoctorDetails addDoctorDetails(DoctorDetails dr);

	public List<DoctorDetails> getAllDoctorDetails();

	public DoctorDetails getDoctorDetailsById(int id);

	public String deleteDoctorDetails(int id);

	public DoctorDetails updateDoctorDetails(DoctorDetails dr);
	
}
