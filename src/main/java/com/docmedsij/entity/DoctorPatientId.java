package com.docmedsij.entity;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Embeddable;

@Embeddable
public class DoctorPatientId implements Serializable{

	private static final long serialVersionUID = 1L;
	int patientId;
	int doctorId;
	
	public DoctorPatientId() {
		// TODO Auto-generated constructor stub
	}

	public DoctorPatientId(int patientId, int doctorId) {
		super();
		this.patientId = patientId;
		this.doctorId = doctorId;
	}

	public int getStudentId() {
		return patientId;
	}

	public void setStudentId(int patientId) {
		this.patientId = patientId;
	}

	public int getExamId() {
		return doctorId;
	}

	public void setExamId(int doctorId) {
		this.doctorId = doctorId;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(doctorId, patientId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DoctorPatientId other = (DoctorPatientId) obj;
		return Objects.equals(doctorId, other.doctorId) && Objects.equals(patientId, other.patientId);
	}
	
	
	
	
}
