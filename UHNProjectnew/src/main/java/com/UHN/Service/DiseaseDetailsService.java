package com.UHN.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.UHN.entities.DiseaseDetails;


@Service
public interface DiseaseDetailsService {
 
	public DiseaseDetails addDiseaseDetails(DiseaseDetails di);

	public List<DiseaseDetails> getAllDiseaseDetails();

	public DiseaseDetails getDiseaseDetailstById(int id);

	public String deleteDiseaseDetails(int id);

	public DiseaseDetails updateDiseaseDetails(DiseaseDetails di);


}
