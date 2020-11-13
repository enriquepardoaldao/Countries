package com.odeene.formacion.restservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.odeene.formacion.entities.AutonomousCommunity;
import com.odeene.formacion.entities.AutonomousCommunityDAO;
import com.odeene.formacion.entities.City;
import com.odeene.formacion.entities.CityDAO;
import com.odeene.formacion.entities.Province;
import com.odeene.formacion.entities.ProvinceDAO;

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
	public List<AutonomousCommunity> findAllCommunities() {
		List<AutonomousCommunity> communities = autonomousDao.findAll();
		return communities;
	}

	@Override
	public List<Province> findAllProvinces() {
		List<Province> provinces = provinceDao.findAll();
		return provinces;
	}

	@Override
	public List<Province> findProvincesByCommunity(Long communityId) {
		List<Province> provinces = provinceDao.findByAutonomousCommunityId(communityId);
		return provinces;
	}

	@Override
	public List<City> findCitiesByProvince(Long provinceId) {
		List<City> cities = cityDao.findByProvinceId(provinceId);
		return cities;
	}

}
