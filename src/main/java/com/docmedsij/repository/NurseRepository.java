package com.docmedsij.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.docmedsij.entity.NurseEntity;

@Repository
public interface NurseRepository extends JpaRepository<NurseEntity, Integer> {

}
