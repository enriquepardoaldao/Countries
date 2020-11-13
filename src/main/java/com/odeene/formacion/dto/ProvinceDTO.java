package com.odeene.formacion.dto;

public class ProvinceDTO {
	private Long id;
	private String name;
	private String communityName;

	public ProvinceDTO() {
		super();
	}

	public ProvinceDTO(Long id, String name, String communityName) {
		super();
		this.id = id;
		this.name = name;
		this.communityName = communityName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCommunityName() {
		return communityName;
	}

	public void setCommunityName(String communityName) {
		this.communityName = communityName;
	}

}
