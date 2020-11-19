package com.odeene.formacion.entities;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CityDAO extends JpaRepository<CityEntity, Long>{
	
	List<CityEntity> findByProvinceId(Long provinceId);
}
