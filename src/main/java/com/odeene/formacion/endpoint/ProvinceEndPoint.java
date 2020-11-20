package com.odeene.formacion.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.odeene.formacion.entities.CityEntity;
import com.odeene.formacion.entities.ProvinceEntity;
import com.odeene.formacion.service.ICountryService;
import com.odeene.formacion.soap.model.City;
import com.odeene.formacion.soap.model.GetCityByProvinceIdRequest;
import com.odeene.formacion.soap.model.GetCityByProvinceIdResponse;
import com.odeene.formacion.soap.model.GetProvincesResponse;
import com.odeene.formacion.soap.model.Province;

@Endpoint
public class ProvinceEndPoint {
	private static final String NAMESPACE_URI = "http://localhost/peticion/gs-producing-web-service";
	
	@Autowired
	private ICountryService countryService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart="getProvincesRequest")
	@ResponsePayload
	public GetProvincesResponse getProvincesRequest() {
		
		GetProvincesResponse response = new GetProvincesResponse();
		List<ProvinceEntity> province = countryService.findAllProvinces();
		
		province.stream().forEach((p) -> {
			response.getProvince().add(toProvinceResponse(p));
		});
		
		return response;
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart="getCityByProvinceIdRequest")
	@ResponsePayload
	public GetCityByProvinceIdResponse getCityByProvinceIdRequest(@RequestPayload GetCityByProvinceIdRequest request) {
		
		GetCityByProvinceIdResponse response = new GetCityByProvinceIdResponse();
		List<CityEntity> city = countryService.findCitiesByProvince(request.getProvinceId());
		
		city.stream().forEach((c) -> {
			response.getCity().add(toCityResponse(c));

		});
			
		return response;
	}
	
	private Province toProvinceResponse(ProvinceEntity province) {
		Province soapProvince = new Province();
		
		soapProvince.setProvinceId(province.getId());
		soapProvince.setName(province.getName());
		soapProvince.setAutonomyName(province.getName());
		soapProvince.setAutonomyArea(province.getAutonomousCommunity().getArea());
		
		return soapProvince;
	}
	
	private City toCityResponse(CityEntity city) {
		City soapCity = new City();
		
		soapCity.setCityId(city.getId());
		soapCity.setName(city.getName());
		soapCity.setPopulation(city.getPopulation());
		soapCity.setProvinceName(city.getProvince().getName());
		
		return soapCity;
	}
	
}
