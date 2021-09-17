package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.docmedsij.docmed.dto.HospitalDTO;

@Service
public interface HospitalService {
	Optional<HospitalDTO> findById(int id);

	List<HospitalDTO> getAll();

	HospitalDTO save(HospitalDTO dto);

	Optional<HospitalDTO> update(HospitalDTO dto);

	HospitalDTO delete(int id);
}
