package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.PatientDTO;
import com.docmedsij.docmed.entity.PatientEntity;

@Mapper(componentModel = "spring")
public interface PatientEntityDtoMapper {

	PatientDTO toDto(PatientEntity patient);
	PatientEntity toEntity(PatientDTO patient);
}
