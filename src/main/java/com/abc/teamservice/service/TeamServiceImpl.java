package com.abc.teamservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.teamservice.entity.TeamEntity;
import com.abc.teamservice.exception.TeamNotFoundException;
import com.abc.teamservice.model.Team;
import com.abc.teamservice.repository.TeamRepository;
import com.abc.teamservice.util.EntityModelUtil;

@Service
public class TeamServiceImpl implements TeamService {

	@Autowired
	private TeamRepository  teamRepository;

	@Override
	public Team saveTeam(Team team) {
		TeamEntity teamEntity = teamRepository.save(EntityModelUtil.teamModelToEntity(team));
		return EntityModelUtil.teamEntityToModel(teamEntity);
	}

	@Override
	public List<Team> getAllTeam() {
		List<TeamEntity> teamEntityList = teamRepository.findAll();
		return EntityModelUtil.teamEntityToModelList(teamEntityList);
	}

	@Override
	public Team getTeamById(int teamId) {
		Optional<TeamEntity> optional= teamRepository.findById(teamId);
		if(optional.isEmpty())
		{
			throw new TeamNotFoundException("Sorry! Team is not existing with id :"+teamId);
		}
		return EntityModelUtil.teamEntityToModel(optional.get());
	}

	@Override
	public void deleteTeam(int teamId) {
		Optional<TeamEntity> optional = teamRepository.findById(teamId);
		if(optional.isEmpty())
		{
			throw new TeamNotFoundException("Sorry! Team is not existing with id :"+teamId);
		}
      teamRepository.deleteById(teamId);	}

	@Override
	public Team updateTeam(Team team) {
		Optional<TeamEntity> optional = teamRepository.findById(team.getTeamId());
		if(optional.isEmpty())
		{
			throw new TeamNotFoundException("Sorry! Team is not existing with id :"+team.getTeamId());
		}
		TeamEntity teamEntity = teamRepository.save(EntityModelUtil.teamModelToEntity(team));
		return EntityModelUtil.teamEntityToModel(teamEntity);


	}

}


