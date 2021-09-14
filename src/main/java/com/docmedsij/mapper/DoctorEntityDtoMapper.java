package com.docmedsij.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.dto.DoctorDTO;
import com.docmedsij.entity.DoctorEntity;

@Mapper(componentModel = "spring")
public interface DoctorEntityDtoMapper {
	
	DoctorDTO toDto(DoctorEntity doctor);
	
	DoctorEntity toEntity(DoctorDTO doctor);
}
