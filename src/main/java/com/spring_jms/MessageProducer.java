package com.spring_jms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class MessageProducer {

	@Autowired
	private JmsTemplate jmsTemplate;

	public void sendMessageToDestination(final String message) {
		jmsTemplate.convertAndSend(message);
	}

}