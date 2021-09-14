package com.docmedsij.entity;

import java.io.Serializable;
import java.util.Objects;

public class HospitalDoctorId  implements Serializable{

	private static final long serialVersionUID = 1L;
	int hospitalId;
	int doctorId;
	
	public HospitalDoctorId() {
		// TODO Auto-generated constructor stub
	}

	public HospitalDoctorId(int hospitalId, int doctorId) {
		super();
		this.hospitalId = hospitalId;
		this.doctorId = doctorId;
	}

	public int getHospitalId() {
		return hospitalId;
	}

	public void setHospitalId(int hospitalId) {
		this.hospitalId = hospitalId;
	}

	public int getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}

	@Override
	public String toString() {
		return "HospitalDoctorId [hospitalId=" + hospitalId + ", doctorId=" + doctorId + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(doctorId, hospitalId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HospitalDoctorId other = (HospitalDoctorId) obj;
		return doctorId == other.doctorId && hospitalId == other.hospitalId;
	}
	
}
