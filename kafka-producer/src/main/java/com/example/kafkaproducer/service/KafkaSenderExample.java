package com.example.kafkaproducer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.kafkaproducer.entity.User;

@Service
public class KafkaSenderExample {

	private KafkaTemplate<String, String> kafkaTemplate;
	
	private KafkaTemplate<String, User> userKafkaTemplate;

//	@Autowired
//	KafkaSenderExample(KafkaTemplate<String, String> kafkaTemplate) {
//		this.kafkaTemplate = kafkaTemplate;
//
//	}
	
	@Autowired
	KafkaSenderExample(KafkaTemplate<String, User> kafkaTemplate) {
		this.userKafkaTemplate = kafkaTemplate;

	}

	public void sendMessage(String message, String topicName) {
		kafkaTemplate.send(topicName, message);
		
		System.out.println("SENT SUCCESSFULLY");
	}
	
	public void sendCustomMessage(User user, String topicName) {


		userKafkaTemplate.send(topicName, user);
		System.out.println("SENT USER SUCCESSFULLY");
	}
	

}
