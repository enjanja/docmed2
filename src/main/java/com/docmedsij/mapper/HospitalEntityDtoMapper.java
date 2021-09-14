package com.docmedsij.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.dto.HospitalDTO;
import com.docmedsij.entity.HospitalEntiy;

@Mapper(componentModel = "spring")
public interface HospitalEntityDtoMapper {
	
	HospitalDTO toDto(HospitalEntiy hospital);

	HospitalEntiy toEntity(HospitalDTO hospital);
}
