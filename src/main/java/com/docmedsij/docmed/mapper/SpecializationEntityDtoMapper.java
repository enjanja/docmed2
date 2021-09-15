package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.SpecializationDTO;
import com.docmedsij.docmed.entity.SpecializationEntity;

@Mapper(componentModel = "spring")
public interface SpecializationEntityDtoMapper {

	SpecializationDTO toDto(SpecializationEntity specialization);

	SpecializationEntity toEntity(SpecializationDTO specialization);
}
