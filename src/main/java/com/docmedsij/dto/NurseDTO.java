package com.docmedsij.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NurseDTO {

	private int id;
	private String username;
	private String password;
	private String name;
}
