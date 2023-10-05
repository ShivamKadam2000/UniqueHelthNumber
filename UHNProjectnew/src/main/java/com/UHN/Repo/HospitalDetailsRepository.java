package com.UHN.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.UHN.entities.HospitalDetails;

@Repository
public interface HospitalDetailsRepository extends JpaRepository<HospitalDetails,Integer>{

}
