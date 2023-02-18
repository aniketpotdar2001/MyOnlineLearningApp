package com.Learner.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.Learner.entity.Clients;
import com.Learner.repository.ClientRepository;

@Controller
public class LearnController {
	@Autowired
	ClientRepository repo;
   
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	
	@GetMapping("/register")
	public String register() {
		return "register";
	}
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/createUser") 
	public String createUser(@ModelAttribute Clients c ,HttpSession session) {
		//validate
		if(c!=null) {
		System.out.println(c.getId());
		System.out.println(c.getEmail());
		System.out.println(c.getAddress());
		System.out.println(c.getName());
		System.out.println(c.getPass());
		
		repo.save(c);
		
		session.setAttribute("msg", " Registered Successfully...!!!");
		}
		return "redirect:/register";
	}
	@PostMapping("/signin")
	public String signin(@ModelAttribute Clients c) {
		
		System.out.println(c.getEmail());
		System.out.println(c.getPass());
		
		
		
		return "user";
	} 
}
