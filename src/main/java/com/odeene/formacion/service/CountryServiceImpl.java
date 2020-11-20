package com.odeene.formacion.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odeene.formacion.entities.AutonomousCommunityDAO;
import com.odeene.formacion.entities.AutonomousCommunityEntity;
import com.odeene.formacion.entities.CityDAO;
import com.odeene.formacion.entities.CityEntity;
import com.odeene.formacion.entities.ProvinceDAO;
import com.odeene.formacion.entities.ProvinceEntity;

@Service
@Transactional(readOnly=true)
public class CountryServiceImpl implements ICountryService{

	@Autowired
	private AutonomousCommunityDAO autonomousDao;
	
	@Autowired
	private ProvinceDAO provinceDao;
	
	@Autowired
	private CityDAO cityDao;
	
	@Override
	public List<AutonomousCommunityEntity> findAllCommunities() {
		List<AutonomousCommunityEntity> communities = autonomousDao.findAll();
		return communities;
	}

	@Override
	public List<ProvinceEntity> findAllProvinces() {
		List<ProvinceEntity> provinces = provinceDao.findAll();
		return provinces;
	}

	@Override
	public List<ProvinceEntity> findProvincesByCommunity(Long communityId) {
		List<ProvinceEntity> provinces = provinceDao.findByAutonomousCommunityId(communityId);
		return provinces;
	}

	@Override
	public List<CityEntity> findCitiesByProvince(Long provinceId) {
		List<CityEntity> cities = cityDao.findByProvinceId(provinceId);
		return cities;
	}

}
