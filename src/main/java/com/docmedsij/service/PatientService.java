package com.docmedsij.service;

import java.util.List;
import java.util.Optional;

import com.docmedsij.dto.PatientDTO;

public interface PatientService {
	Optional<PatientDTO> findById(int id);
	List<PatientDTO> getAll();
	PatientDTO save(PatientDTO dto);
	Optional<PatientDTO> update(PatientDTO dto);
	PatientDTO delete(int id);
}
