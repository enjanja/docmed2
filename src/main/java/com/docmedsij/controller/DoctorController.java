package com.docmedsij.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

	@GetMapping()
	public String getAllDoctors() {
		return "";
	}
}
