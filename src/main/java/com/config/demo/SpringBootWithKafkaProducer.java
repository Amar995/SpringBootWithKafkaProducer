package com.config.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
@ComponentScan(basePackages = {"com.config.producer","com.config.consumer"})
public class SpringBootWithKafkaProducer
{

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWithKafkaProducer.class, args);
	}

}
