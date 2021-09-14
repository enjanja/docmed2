package com.docmedsij.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.dto.NurseDTO;
import com.docmedsij.entity.NurseEntity;


@Mapper(componentModel = "spring")
public interface NurseEntityDtoMapper {
	
	NurseDTO toDto(NurseEntity nurse);

	NurseEntity toEntity(NurseDTO nurse);
}
