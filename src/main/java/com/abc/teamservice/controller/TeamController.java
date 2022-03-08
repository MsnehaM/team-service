package com.abc.teamservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abc.teamservice.model.Team;
import com.abc.teamservice.service.TeamService;

@RestController
@RequestMapping("/team")
public class TeamController {
	
	@Autowired
	private TeamService teamService;
	
	@PostMapping("/save")
	public ResponseEntity<Team> addTeam(@RequestBody Team team)
	{
		Team newTeam = teamService.saveTeam(team);
		return new ResponseEntity<Team>(newTeam, HttpStatus.CREATED);
	}
	
	@GetMapping("/get/all")
	public List<Team> getAllTeamDetails()
	{
		return teamService.getAllTeam();
	}
	
	@GetMapping("/get/{team_id}")
	public ResponseEntity<?> getTeamDetailsById(@PathVariable("team_id") int teamId)
	{
		Team teamDetails = teamService.getTeamById(teamId);
		return new ResponseEntity<>(teamDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{team_id}")
	public void deleteTeam(@PathVariable("team_id") int teamId)
	{
		teamService.deleteTeam(teamId);
	}
	
	@PutMapping("/{update}")
	public Team updateTeam(@RequestBody Team team)
	{
		return teamService.updateTeam(team);
	}
	

}
