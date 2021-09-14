package com.docmedsij.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.dto.PatientDTO;
import com.docmedsij.entity.PatientEntity;

@Mapper(componentModel = "spring")
public interface PatientEntityDtoMapper {

	PatientDTO toDto(PatientEntity patient);
	PatientEntity toEntity(PatientDTO patient);
}
