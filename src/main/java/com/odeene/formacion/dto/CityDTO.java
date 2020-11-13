package com.odeene.formacion.dto;

public class CityDTO {
	private Long id;
	private String name;
	private int population;
	private String provinceName;

	public CityDTO() {
		super();
	}

	public CityDTO(Long id, String name, int population, String provinceName) {
		super();
		this.id = id;
		this.name = name;
		this.population = population;
		this.provinceName = provinceName;
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

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public String getProvinceName() {
		return provinceName;
	}

	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
