package com.docmedsij.service;

import java.util.List;
import java.util.Optional;

import com.docmedsij.dto.HospitalDTO;

public interface HospitalService {
	Optional<HospitalDTO> findById(int id);
	List<HospitalDTO> getAll();
	HospitalDTO save(HospitalDTO dto);
	Optional<HospitalDTO> update(HospitalDTO dto);
	HospitalDTO delete(int id);
}
