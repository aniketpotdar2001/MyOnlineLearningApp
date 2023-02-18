package com.Learner.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Learner.entity.Clients;
import com.Learner.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	ClientRepository repo;
	@Override
	public Clients createUser(Clients client) {
		
		return null;
	}

	@Override
	public boolean checkEmail(String email) {
		
		return true;
	}

}
