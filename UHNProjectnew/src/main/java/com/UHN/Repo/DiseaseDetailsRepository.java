package com.UHN.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UHN.entities.DiseaseDetails;

@Repository
public interface DiseaseDetailsRepository extends JpaRepository<DiseaseDetails,Integer>{

}
