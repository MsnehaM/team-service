package com.abc.teamservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Team_tbl")
public class TeamEntity {
	
	@Id
	//@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Team_id")
	private int teamId;
	
	@Column(name="Team_name")
	private String teamName;
	
	@Column(name="Team_country")
	private String teamCountry;

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getTeamCountry() {
		return teamCountry;
	}

	public void setTeamCountry(String teamCountry) {
		this.teamCountry = teamCountry;
	}
	
	

}
