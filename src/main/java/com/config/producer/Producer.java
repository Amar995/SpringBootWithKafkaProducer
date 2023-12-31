package com.config.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Producer {

	@Autowired
	KafkaTemplate<String, String> temp;


	@GetMapping("/show")
	public String show() {
		String str = "";
		try {

			temp.send("amar", "hi amar ,how are you?");
			str = "sucess";
		} catch (Exception e) {
			str = "faliure";
		}
		return str;
	}
}
