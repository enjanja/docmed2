package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docmedsij.docmed.dto.PatientDTO;

@Service
public interface PatientService {
	Optional<PatientDTO> findById(int id);

	List<PatientDTO> getAll();

	PatientDTO save(PatientDTO dto);

	Optional<PatientDTO> update(PatientDTO dto);

	PatientDTO delete(int id);
}
