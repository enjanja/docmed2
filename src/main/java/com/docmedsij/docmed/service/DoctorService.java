package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.docmedsij.docmed.dto.DoctorDTO;

@Service
@Transactional
public interface DoctorService {
	Optional<DoctorDTO> findById(int id);

	List<DoctorDTO> getAll();

	DoctorDTO save(DoctorDTO dto);

	Optional<DoctorDTO> update(DoctorDTO dto);

	DoctorDTO delete(int id);
}
