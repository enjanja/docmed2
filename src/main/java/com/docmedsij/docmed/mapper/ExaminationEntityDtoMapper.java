package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.ExaminationDTO;
import com.docmedsij.docmed.entity.ExaminationEntity;

@Mapper(componentModel = "spring")
public interface ExaminationEntityDtoMapper {

	ExaminationDTO toDto(ExaminationEntity examination);

	ExaminationEntity toEntity(ExaminationDTO examination);

}
