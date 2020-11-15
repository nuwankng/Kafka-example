package com.example.kafkaconsumer.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.kafkaconsumer.entity.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
public class KafkaListenersExample {

//	@KafkaListener(topics = "kng1", groupId = "myGroup")
//	public void listener(String data) {
//		System.out.println("message recieved : &&&&&&&&&&&&&&&& : " + data);
//	}

//  @KafkaListener(
//    topics = "kng1", 
//    groupId = "myGroup")
//  void commonListenerForMultipleTopics(String message) {
//	  System.out.println("MultipleTopicListener - {} "+ message);
//  }

//	@KafkaListener(topics = "kng1", groupId = "myGroup", containerFactory = "userKafkaListenerContainerFactory")
//	public void listener(User user) {
//		System.out.println("CustomUserListener [{}] ################################" + user);
//	}
	
	@KafkaListener(topics = "kng1", groupId = "myGroup")
	public void listener(String message) throws JsonMappingException, JsonProcessingException {
		
		System.out.println("message recieved : &&&&&&&&&&&&&&&& : " + message);
		
		ObjectMapper mapper = new ObjectMapper();
		User user =mapper.readValue(message, User.class);
		
		System.out.println("CustomUserListener [{}] ################################" + user);
	}

}