package com.odeene.formacion.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProvinceDAO extends JpaRepository<ProvinceEntity, Long> {
	List<ProvinceEntity> findByAutonomousCommunityId(Long autonomousId);
}
