package com.config.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    /**
     * @author AmarNayak
     * @param message 
     * @return Sring
     * */
	@KafkaListener(topics = "amar", groupId = "group_id")
	public String sh(String message) {
		System.out.println("execute  1" + message);
		return message;
	}

}
