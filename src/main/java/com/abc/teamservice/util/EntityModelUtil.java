package com.abc.teamservice.util;

import java.util.ArrayList;
import java.util.List;

import com.abc.teamservice.entity.TeamEntity;
import com.abc.teamservice.model.Team;

public class EntityModelUtil {
	

	public static TeamEntity teamModelToEntity(Team team)
	{
		TeamEntity teamEntity = new TeamEntity();
		
		teamEntity.setTeamId(team.getTeamId());
		teamEntity.setTeamName(team.getTeamName());
		teamEntity.setTeamCountry(team.getTeamCountry());
		
		
		return teamEntity;
	}
	
	public static Team teamEntityToModel(TeamEntity teamEntity)
	{
		Team team = new Team();
		
		team.setTeamId(teamEntity.getTeamId());
		team.setTeamName(teamEntity.getTeamName());
		team.setTeamCountry(teamEntity.getTeamCountry());
		
		return team;
	}
	
	public static List<Team> teamEntityToModelList(List<TeamEntity> entityList)
	{
		List<Team> teamList = new ArrayList<>();
		
		entityList.forEach(entity -> {
		
				Team team = new Team();
				team.setTeamId(entity.getTeamId());
				team.setTeamName(entity.getTeamName());
				team.setTeamCountry(entity.getTeamCountry());
				
				teamList.add(team);
		});
		return teamList;
	}

}

