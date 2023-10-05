package com.UHN.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class PatientDetails {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="P_Id")
	private int id;
	@Column(name="P_name")
	private String name;
	private int Age;
	private String Blood_Group;
	private int Weigth;
	private int Heigth;
	private double BMI;
	private String Gender;
	private String Allergies;
	private int Adhar_Number;
	private int Mobile_Number;
	private String Email_Id;
	private String City;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<HospitalDetails> hospitalDetailsList;
	 
	@OneToMany(cascade=CascadeType.ALL)
	private List<DoctorDetails> doctorDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<DiseaseDetails> diseaseDetails;
	
	@OneToMany(cascade=CascadeType.ALL)
	private List<MedicineDetails> medicineDetails;
	
	
	

}
