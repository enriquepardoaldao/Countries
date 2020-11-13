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

import com.odeene.formacion.dto.ProvinceDTO;
import com.odeene.formacion.entities.AutonomousCommunity;
import com.odeene.formacion.entities.Province;
import com.odeene.formacion.restservice.ICountryService;

@RestController
@RequestMapping("/autonomous-communities")
public class AutonomousCommunityController {
	
	@Autowired
	private ICountryService countryService;
	
	@GetMapping("")
	public ResponseEntity<?> getAllCommunities() {

		List<AutonomousCommunity> communities = countryService.findAllCommunities();
		return new ResponseEntity<List<AutonomousCommunity>>(communities, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/provinces")
	public ResponseEntity<?> getCitiesOfProvince(@PathVariable long id) {

		List<Province> provinces = countryService.findProvincesByCommunity(id);
		List<ProvinceDTO> provinceDto = new ArrayList<>();

		provinces.stream().forEach((p) -> {
			provinceDto.add(new ProvinceDTO(p.getId(), p.getName(), p.autonomousCommunity.getName()));
		});

		return new ResponseEntity<List<ProvinceDTO>>(provinceDto, HttpStatus.OK);
	}


}
