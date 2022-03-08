package com.abc.teamservice.service;

import java.util.List;

import com.abc.teamservice.entity.TeamEntity;
import com.abc.teamservice.model.Team;


public interface TeamService {
	
public Team saveTeam(Team team);
	
	public List<Team> getAllTeam();
	
	public Team getTeamById(int teamId);
	
	public void deleteTeam(int teamId);
	
	public Team updateTeam(Team team);

}
