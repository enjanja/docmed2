package com.docmedsij.service;

import java.util.List;
import java.util.Optional;

import com.docmedsij.dto.NurseDTO;

public interface NurseService {
	Optional<NurseDTO> findById(int id);
	List<NurseDTO> getAll();
	NurseDTO save(NurseDTO dto);
	Optional<NurseDTO> update(NurseDTO dto);
	NurseDTO delete(int id);
}
