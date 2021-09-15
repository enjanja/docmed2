package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.docmedsij.docmed.dto.NurseDTO;

@Service
@Transactional
public interface NurseService {
	Optional<NurseDTO> findById(int id);

	List<NurseDTO> getAll();

	NurseDTO save(NurseDTO dto);

	Optional<NurseDTO> update(NurseDTO dto);

	NurseDTO delete(int id);
}
