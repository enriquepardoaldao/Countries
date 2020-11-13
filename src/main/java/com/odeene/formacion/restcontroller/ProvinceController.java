package com.odeene.formacion.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odeene.formacion.dto.CityDTO;
import com.odeene.formacion.dto.ProvinceDTO;
import com.odeene.formacion.entities.City;
import com.odeene.formacion.entities.Province;
import com.odeene.formacion.restservice.ICountryService;

@RestController
@RequestMapping("/provinces")
public class ProvinceController {

	@Autowired
	private ICountryService countryService;

	@GetMapping("")
	public ResponseEntity<?> getAllProvinces() {

		List<Province> provinces = countryService.findAllProvinces();
		List<ProvinceDTO> provDTO = new ArrayList<>();

		provinces.stream().forEach((p) -> {
			provDTO.add(new ProvinceDTO(p.getId(), p.getName(), p.getAutonomousCommunity().getName()));
		});
		return new ResponseEntity<List<ProvinceDTO>>(provDTO, HttpStatus.OK);
	}

	@GetMapping("/{id}/cities")
	public ResponseEntity<?> getCitiesOfProvince(@PathVariable long id) {

		List<City> cities = countryService.findCitiesByProvince(id);
		List<CityDTO> cityDto = new ArrayList<>();

		cities.stream().forEach((c) -> {
			cityDto.add(new CityDTO(c.getId(), c.getName(), c.getPopulation(), c.getProvince().getName()));
		});

		return new ResponseEntity<List<CityDTO>>(cityDto, HttpStatus.OK);
	}

}
