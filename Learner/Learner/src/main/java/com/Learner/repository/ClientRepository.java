package com.Learner.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Learner.entity.Clients;
@Repository
public interface ClientRepository extends JpaRepository<Clients, Integer>{
	
	public boolean existsByEmail(String email);
}
