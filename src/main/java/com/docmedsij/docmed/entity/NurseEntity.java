package com.docmedsij.docmed.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "nurse", uniqueConstraints = { @UniqueConstraint(columnNames = { "username" }) })
public class NurseEntity {

	@Id
	private int id;
	private String username;
	private String password;
	private String name;

//	@OneToOne(cascade = CascadeType.ALL)
//	private HospitalEntity hospital;
}
