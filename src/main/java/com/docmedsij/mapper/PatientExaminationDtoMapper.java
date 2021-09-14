package com.docmedsij.mapper;

import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;

import com.docmedsij.entity.PatientExaminationEntity;

/// nooope

@Mapper(componentModel = "spring", uses = {
		PatientEntityDtoMapper.class,
		HospitalEntityDtoMapper.class
}, injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface PatientExaminationDtoMapper {
//	PatientExaminationEntity toEntity(PatientExaminationDto dto);
}
