package com.odeene.formacion.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odeene.formacion.dto.CityDTO;
import com.odeene.formacion.dto.ProvinceDTO;
import com.odeene.formacion.entities.CityEntity;
import com.odeene.formacion.service.ICountryService;

@RestController
@RequestMapping("/provinces")
public class ProvinceController {

	@Autowired
	private ICountryService countryService;

	@GetMapping("")
	public List<ProvinceDTO> getAllProvinces() {
        return countryService.findAllProvinces().stream()
            .map(province -> new ProvinceDTO(province.getId(), province.getName(), province.getAutonomousCommunity().getName()))
            .collect(Collectors.toList());
	}

	@GetMapping("/{id}/cities")
	public List<CityDTO> getCitiesOfProvince(@PathVariable long id) {

		return countryService.findCitiesByProvince(id).stream()
				.map(city -> new CityDTO(city.getId(), city.getName(), city.getPopulation(), city.getProvince().getName()))
				.collect(Collectors.toList());
	}

}
