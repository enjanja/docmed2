package com.docmedsij.docmed.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.docmedsij.docmed.dto.HospitalDTO;

@Service
@Transactional
public interface HospitalService {
	Optional<HospitalDTO> findById(int id);

	List<HospitalDTO> getAll();

	HospitalDTO save(HospitalDTO dto);

	Optional<HospitalDTO> update(HospitalDTO dto);

	HospitalDTO delete(int id);
}
