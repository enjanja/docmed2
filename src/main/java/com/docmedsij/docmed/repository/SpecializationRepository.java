package com.docmedsij.docmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docmedsij.docmed.entity.SpecializationEntity;

@Repository
public interface SpecializationRepository extends JpaRepository<SpecializationEntity, Integer>{

}
