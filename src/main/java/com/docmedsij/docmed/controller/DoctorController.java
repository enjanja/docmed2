package com.docmedsij.docmed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.docmedsij.docmed.dto.HospitalDTO;
import com.docmedsij.docmed.mapper.HospitalEntityDtoMapper;
import com.docmedsij.docmed.repository.HospitalRepozitory;

@RestController
public class DoctorController {

//	@Autowired
//	DoctorService doctorService;
//	@Autowired
	HospitalRepozitory hospitalService;

//	@Autowired
	HospitalEntityDtoMapper mapper;

	@Autowired
	public DoctorController(HospitalRepozitory hospitalService, HospitalEntityDtoMapper mapper) {
		this.hospitalService = hospitalService;
		this.mapper = mapper;
	}

	@GetMapping()
	public String getAllDoctors() {
		return "";
	}

//	@PostMapping("/createDoctor")
//	public ResponseEntity<Object> createDoctor(@RequestBody DoctorDTO doctorDto) {
//
//		doctorService.save(doctorDto);
//
//		return ResponseEntity.status(HttpStatus.OK).body("Verification mail was sent");
//	}

	@PostMapping("/createHospital")
	public ResponseEntity<Object> createHospital(@RequestBody HospitalDTO hospital) {

		hospitalService.save(mapper.toEntity(hospital));
		return ResponseEntity.status(HttpStatus.OK).body("Verification mail was sent");
	}

}
