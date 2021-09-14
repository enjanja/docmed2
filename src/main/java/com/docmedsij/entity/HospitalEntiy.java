package com.docmedsij.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "hospital", uniqueConstraints = { @UniqueConstraint(columnNames = { "address" }) })
public class HospitalEntiy {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	private String name;
}
