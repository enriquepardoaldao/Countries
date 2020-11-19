package com.odeene.formacion.service;

import java.util.List;

import com.odeene.formacion.entities.AutonomousCommunityEntity;
import com.odeene.formacion.entities.CityEntity;
import com.odeene.formacion.entities.ProvinceEntity;

public interface ICountryService {

	List<AutonomousCommunityEntity> findAllCommunities();

	List<ProvinceEntity> findAllProvinces();

	List<ProvinceEntity> findProvincesByCommunity(Long communityId);

	List<CityEntity> findCitiesByProvince(Long provinceId);

}
