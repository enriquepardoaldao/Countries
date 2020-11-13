package com.odeene.formacion.restservice;

import java.util.List;

import com.odeene.formacion.entities.AutonomousCommunity;
import com.odeene.formacion.entities.City;
import com.odeene.formacion.entities.Province;

public interface ICountryService {

	List<AutonomousCommunity> findAllCommunities();

	List<Province> findAllProvinces();

	List<Province> findProvincesByCommunity(Long communityId);

	List<City> findCitiesByProvince(Long provinceId);

}
