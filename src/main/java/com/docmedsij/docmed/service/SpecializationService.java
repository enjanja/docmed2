package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.docmedsij.docmed.dto.SpecializationDTO;

@Service
@Transactional
public interface SpecializationService {
	Optional<SpecializationDTO> findById(int id);

	List<SpecializationDTO> getAll();

	SpecializationDTO save(SpecializationDTO dto);

	Optional<SpecializationDTO> update(SpecializationDTO dto);

	SpecializationDTO delete(int id);
}
