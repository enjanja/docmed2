package com.docmedsij.docmed.mapper;

import org.mapstruct.Mapper;

import com.docmedsij.docmed.dto.HospitalSimpleDTO;
import com.docmedsij.docmed.entity.HospitalEntity;

@Mapper(componentModel = "spring")
public interface HospitalSimpleDtoMapper {

	HospitalSimpleDTO toDto(HospitalEntity hopital);

	HospitalEntity toeEntity(HospitalSimpleDTO hopital);

}
