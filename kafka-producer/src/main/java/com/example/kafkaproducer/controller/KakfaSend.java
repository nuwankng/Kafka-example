package com.example.kafkaproducer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaproducer.entity.User;
import com.example.kafkaproducer.service.KafkaSenderExample;

@RestController
public class KakfaSend {
	
	
	@Autowired
	private KafkaSenderExample sender;
	
	@PostMapping("/send")
	public void createEmployee() {
		
		
		sender.sendMessage("Halooooooooooooooo", "kng1");
		
		
	}
	
	@PostMapping("/senduser")
	public void createEmployeew(@RequestBody User user) {
		
		
		sender.sendCustomMessage(user, "kng1");
		
		
	}

}
