package com.docmedsij.service;

import java.util.List;
import java.util.Optional;

import com.docmedsij.dto.SpecializationDTO;

public interface SpecializationService {
	Optional<SpecializationDTO> findById(int id);
	List<SpecializationDTO> getAll();
	SpecializationDTO save(SpecializationDTO dto);
	Optional<SpecializationDTO> update(SpecializationDTO dto);
	SpecializationDTO delete(int id);
}
