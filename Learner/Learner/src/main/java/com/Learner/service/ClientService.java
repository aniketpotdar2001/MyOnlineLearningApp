package com.Learner.service;

import com.Learner.entity.Clients;

public interface ClientService {

	
	public Clients createUser(Clients client);
	
	public boolean checkEmail(String email);
}
