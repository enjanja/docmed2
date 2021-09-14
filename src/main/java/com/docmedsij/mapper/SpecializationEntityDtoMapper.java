package com.docmedsij.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.dto.SpecializationDTO;
import com.docmedsij.entity.SpecializationEntity;

@Mapper(componentModel = "spring")
public interface SpecializationEntityDtoMapper {

	SpecializationDTO toDto(SpecializationEntity specialization);

	SpecializationEntity toEntity(SpecializationDTO specialization);
}
