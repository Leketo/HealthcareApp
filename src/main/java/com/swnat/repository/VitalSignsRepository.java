package com.swnat.repository;

import com.swnat.entity.VitalSigns;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  VitalSignsRepository extends JpaRepository<VitalSigns, Integer> {
}
