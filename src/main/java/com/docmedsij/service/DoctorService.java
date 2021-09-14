package com.docmedsij.service;

import java.util.List;
import java.util.Optional;

import com.docmedsij.dto.DoctorDTO;

public interface DoctorService {
	Optional<DoctorDTO> findById(int id);
	List<DoctorDTO> getAll();
	DoctorDTO save(DoctorDTO dto);
	Optional<DoctorDTO> update(DoctorDTO dto);
	DoctorDTO delete(int id);
}

