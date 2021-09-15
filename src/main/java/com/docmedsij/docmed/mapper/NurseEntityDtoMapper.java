package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.NurseDTO;
import com.docmedsij.docmed.entity.NurseEntity;


@Mapper(componentModel = "spring")
public interface NurseEntityDtoMapper {
	
	NurseDTO toDto(NurseEntity nurse);

	NurseEntity toEntity(NurseDTO nurse);
}
