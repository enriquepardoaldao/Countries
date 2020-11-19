package com.odeene.formacion.restcontroller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.odeene.formacion.dto.ProvinceDTO;
import com.odeene.formacion.entities.AutonomousCommunityEntity;
import com.odeene.formacion.entities.ProvinceEntity;
import com.odeene.formacion.service.ICountryService;

@RestController
@RequestMapping("/autonomous-communities")
public class AutonomousCommunityController {
	
	@Autowired
	private ICountryService countryService;
	
	@GetMapping("")
	public ResponseEntity<List<AutonomousCommunityEntity>> getAllCommunities() {

		List<AutonomousCommunityEntity> communities = countryService.findAllCommunities();
		return new ResponseEntity<List<AutonomousCommunityEntity>>(communities, HttpStatus.OK);
	}
	
	@GetMapping("/{id}/provinces")
	public List<ProvinceDTO> getCitiesOfProvince(@PathVariable long id) {

		//List<Province> provinces = countryService.findProvincesByCommunity(id);
		//List<ProvinceDTO> provinceDto = new ArrayList<>();

		/*provinces.stream().forEach((p) -> {
			provinceDto.add(new ProvinceDTO(p.getId(), p.getName(), p.autonomousCommunity.getName()));
		});*/

		return countryService.findProvincesByCommunity(id).stream()
				.map(province -> new ProvinceDTO(province.getId(), province.getName(), province.autonomousCommunity.getName()))
				.collect(Collectors.toList());
	}


}
