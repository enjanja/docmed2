package com.docmedsij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docmedsij.entity.HospitalEntiy;

@Repository
public interface HospitalRepozitory extends JpaRepository<HospitalEntiy, Integer> {

}
