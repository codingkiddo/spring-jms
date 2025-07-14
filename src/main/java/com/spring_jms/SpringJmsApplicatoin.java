package com.spring_jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJmsApplicatoin implements CommandLineRunner {

	@Autowired
	private MessageProducer messageProducer;

	public static void main(String[] args) {
		SpringApplication.run(SpringJmsApplicatoin.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		messageProducer.sendMessageToDestination("Hello JMS !!!!!!");
	}

}
