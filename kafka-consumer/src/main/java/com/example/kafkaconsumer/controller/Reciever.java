package com.example.kafkaconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.kafkaconsumer.service.KafkaListenersExample;



@RestController
public class Reciever {
	
	@Autowired
	private KafkaListenersExample reciver;
	
	@GetMapping("/get")
	public void createEmployee() {
		
		
		
		
		
	}

}
