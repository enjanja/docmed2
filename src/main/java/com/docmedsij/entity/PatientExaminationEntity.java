package com.docmedsij.entity;

import java.time.LocalDate;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "patient_examination")
public class PatientExaminationEntity {
	
	@EmbeddedId
	DoctorPatientId id;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("patientId")
	PatientEntity patient;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@MapsId("doctorId")
	DoctorEntity doctor;
	
	@Column(name = "examination_date")
	@CreatedDate
	LocalDate examinationDate;
	
	String diagnosis;
	
	public PatientExaminationEntity() {
		// TODO Auto-generated constructor stub
	}

	public PatientExaminationEntity(PatientEntity patient, DoctorEntity doctor ) {
		super();
		this.patient = patient;
		this.doctor = doctor;
		this.id = new DoctorPatientId(doctor.getId(), patient.getId());
	}

	public DoctorPatientId getId() {
		return id;
	}

	public void setId(DoctorPatientId id) {
		this.id = id;
	}

	public PatientEntity getPatient() {
		return patient;
	}

	public void setPatient(PatientEntity patient) {
		this.patient = patient;
	}

	public DoctorEntity getDoctor() {
		return doctor;
	}

	public void setDoctor(DoctorEntity doctor) {
		this.doctor = doctor;
	}

	public LocalDate getExaminationDate() {
		return examinationDate;
	}

	public void setExaminationDate(LocalDate examinationDate) {
		this.examinationDate = examinationDate;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(diagnosis, doctor, examinationDate, id, patient);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PatientExaminationEntity other = (PatientExaminationEntity) obj;
		return Objects.equals(diagnosis, other.diagnosis) && Objects.equals(doctor, other.doctor)
				&& Objects.equals(examinationDate, other.examinationDate) && Objects.equals(id, other.id)
				&& Objects.equals(patient, other.patient);
	}
	
	
}
