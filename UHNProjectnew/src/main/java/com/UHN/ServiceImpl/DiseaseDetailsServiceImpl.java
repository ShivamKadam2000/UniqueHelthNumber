package com.UHN.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.UHN.Repo.DiseaseDetailsRepository;
import com.UHN.Service.DiseaseDetailsService;
import com.UHN.entities.DiseaseDetails;

@Service
public class DiseaseDetailsServiceImpl implements DiseaseDetailsService{

	@Autowired
	DiseaseDetailsRepository diseaseDeatailsRepository;
	
	@Override
	public DiseaseDetails addDiseaseDetails(DiseaseDetails di) {
		// TODO Auto-generated method stub
		return diseaseDeatailsRepository.save(di);
	}

	@Override
	public List<DiseaseDetails> getAllDiseaseDetails() {
		// TODO Auto-generated method stub
		return diseaseDeatailsRepository.findAll();
	}

	@Override
	public DiseaseDetails getDiseaseDetailstById(int id) {
		// TODO Auto-generated method stub
		return diseaseDeatailsRepository.findById(id).get();
	}

	@Override
	public String deleteDiseaseDetails(int id) {
		// TODO Auto-generated method stub
		diseaseDeatailsRepository.deleteById(id);
		return "DiseaseDetails Deleted";
	}

	@Override
	public DiseaseDetails updateDiseaseDetails(DiseaseDetails di) {
		// TODO Auto-generated method stub
		return null;
	}

}
