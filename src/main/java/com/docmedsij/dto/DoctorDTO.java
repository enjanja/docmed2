package com.docmedsij.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDTO {

	private int id;
	private String name;	
	private SpecializationDTO specialization;	
	private String username;	
	private String password;
	
}
