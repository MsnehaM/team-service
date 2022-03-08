package com.abc.teamservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.abc.teamservice.entity.TeamEntity;

@Repository
	public interface TeamRepository extends JpaRepository<TeamEntity,Integer>
	{
		
	}


