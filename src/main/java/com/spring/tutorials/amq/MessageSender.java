package com.spring.tutorials.amq;

import org.springframework.jms.core.JmsTemplate;

public class MessageSender {

	private JmsTemplate jmsTemplate;

	public void setJmsTemplate(JmsTemplate jmsTemplate) {
		this.jmsTemplate = jmsTemplate;
	}

	public void send(final Object Object) {
		jmsTemplate.convertAndSend(Object);
	}

}
