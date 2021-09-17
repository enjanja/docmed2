package com.docmedsij.docmed.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "doctor", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class DoctorEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "specialization_id")
	private SpecializationEntity specialization;

//	@OneToMany(mappedBy = "doctor")
//	Set<ExaminationEntity> examinations;

	@ManyToMany(mappedBy = "doctors")
	Set<HospitalEntity> hospitals;

	private String username;

	private String password;

}
