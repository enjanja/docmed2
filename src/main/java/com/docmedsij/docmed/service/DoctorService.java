package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docmedsij.docmed.dto.DoctorDTO;

@Service
public interface DoctorService {
	Optional<DoctorDTO> findById(int id);

	List<DoctorDTO> getAll();

	DoctorDTO save(DoctorDTO dto);

	Optional<DoctorDTO> update(DoctorDTO dto);

	DoctorDTO delete(int id);
}
