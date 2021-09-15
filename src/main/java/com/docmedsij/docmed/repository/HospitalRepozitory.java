package com.docmedsij.docmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docmedsij.docmed.entity.HospitalEntity;

@Repository
public interface HospitalRepozitory extends JpaRepository<HospitalEntity, Integer> {

}
