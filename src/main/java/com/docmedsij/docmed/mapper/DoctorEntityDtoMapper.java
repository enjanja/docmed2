package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.DoctorDTO;
import com.docmedsij.docmed.entity.DoctorEntity;

@Mapper(componentModel = "spring")
public interface DoctorEntityDtoMapper {

	public DoctorDTO toDto(DoctorEntity doctor);

	public DoctorEntity toEntity(DoctorDTO doctor);
}
