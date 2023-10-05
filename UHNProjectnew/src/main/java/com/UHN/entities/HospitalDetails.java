package com.UHN.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class HospitalDetails {
	@Id
	@Column(name="H_id")
	private int id;
	@Column(name="H_name")
	private String name;
	
	@ManyToOne(cascade=CascadeType.ALL ,fetch=FetchType.EAGER)
	@JsonIgnore
	 PatientDetails pt;
}
