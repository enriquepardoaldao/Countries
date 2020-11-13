package com.odeene.formacion.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Province")
public class Province {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "name")
	private String name;
	
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "autonomousCommunityId")
	public AutonomousCommunity autonomousCommunity;
	
	public Province() {
		super();
	}

	public Province(Long id, String name, AutonomousCommunity autonomousCommunity) {
		super();
		this.id = id;
		this.name = name;
		this.autonomousCommunity = autonomousCommunity;
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


	public AutonomousCommunity getAutonomousCommunity() {
		return autonomousCommunity;
	}

	public void setAutonomousCommunity(AutonomousCommunity autonomousCommunity) {
		this.autonomousCommunity = autonomousCommunity;
	}
	
	
	
	
}
