package com.docmedsij.docmed.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hospital", uniqueConstraints = { @UniqueConstraint(columnNames = { "address" }) })
public class HospitalEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String name;

	@ManyToMany
	@JoinTable(name = "hospital_doctor", joinColumns = @JoinColumn(name = "hospital_id"), inverseJoinColumns = @JoinColumn(name = "doctor_id"))
	Set<DoctorEntity> doctors = new HashSet<>();

	public void addDoctor(DoctorEntity doctor) {
		doctors.add(doctor);
		doctor.getHospitals().add(this);
	}

	public void removeDoctor(DoctorEntity doctor) {
		doctors.remove(doctor);
		doctor.getHospitals().remove(this);
	}
}
