package com.spring_jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring_jms.producer.MessageProducer;

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
		Thread.sleep(10000);
		messageProducer.sendMessageToDestination("Bye JMS !!!!!!");
	}

}
