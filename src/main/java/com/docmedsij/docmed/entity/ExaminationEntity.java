package com.docmedsij.docmed.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ExaminationEntity {

	@Id
	Long id;

	@ManyToOne
	@JoinColumn(name = "patient_id")
	PatientEntity patient;

	@ManyToOne
	@JoinColumn(name = "doctor_id")
	DoctorEntity doctor;

	Date date;

	String diagnosis;

}
