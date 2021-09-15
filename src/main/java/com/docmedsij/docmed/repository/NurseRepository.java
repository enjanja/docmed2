package com.docmedsij.docmed.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docmedsij.docmed.entity.NurseEntity;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, Integer> {

}
