package com.odeene.formacion.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.odeene.formacion.entities.AutonomousCommunityEntity;
import com.odeene.formacion.entities.ProvinceEntity;
import com.odeene.formacion.service.ICountryService;
import com.odeene.formacion.soap.model.AutonomousCommunity;
import com.odeene.formacion.soap.model.GetAutonomousCommunityResponse;
import com.odeene.formacion.soap.model.GetProvinceByAutonomousIdRequest;
import com.odeene.formacion.soap.model.GetProvinceByAutonomousIdResponse;
import com.odeene.formacion.soap.model.Province;

@Endpoint
public class AutonomousEndPoint {
	private static final String NAMESPACE_URI = "http://localhost/peticion/gs-producing-web-service";

	@Autowired
	private ICountryService countryService;
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart="getAutonomousCommunityRequest")
	@ResponsePayload
	public GetAutonomousCommunityResponse getAutonomousCommunityRequest() {
		
		GetAutonomousCommunityResponse response = new GetAutonomousCommunityResponse();
		List<AutonomousCommunityEntity> autonomias = countryService.findAllCommunities();
		
		autonomias.stream().forEach((a) -> {
			response.getCommunity().add(toAutonomousResponse(a));
		});
		
		return response;
		
	}
	
	@PayloadRoot(namespace = NAMESPACE_URI, localPart = "getProvinceByAutonomousIdRequest")
	@ResponsePayload
	public GetProvinceByAutonomousIdResponse getProvinceByAutonomousIdRequest(@RequestPayload  GetProvinceByAutonomousIdRequest request) {
		
		GetProvinceByAutonomousIdResponse response = new GetProvinceByAutonomousIdResponse();
		List<ProvinceEntity> provincia = countryService.findProvincesByCommunity(request.getCommunityId());
		
		provincia.stream().forEach((province) -> {
			response.getProvince().add(toProvinceResponse(province));
		});
		
		return response;
		
	}
	
	private Province toProvinceResponse(ProvinceEntity province) {
		Province soapProvince = new Province();
		
		soapProvince.setProvinceId(province.getId());
		soapProvince.setName(province.getName());
		soapProvince.setAutonomyName(province.getAutonomousCommunity().getName());
		soapProvince.setAutonomyArea(province.getAutonomousCommunity().getArea());
		
		return soapProvince;
	}

	private AutonomousCommunity toAutonomousResponse(AutonomousCommunityEntity community) {
		
		AutonomousCommunity soapCommunity = new AutonomousCommunity();
		
		soapCommunity.setAutonomousCommunityId(community.getId());
		soapCommunity.setName(community.getName());
		soapCommunity.setArea(community.getArea());

		return soapCommunity;
		
	}

}
