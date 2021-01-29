package com.rabbitmqapp.code;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;

public class RabbitMQMessageListener implements MessageListener{

	public void onMessage(Message message) {
		System.out.println("meesage = " + new String(message.getBody()) );
		
	}
	
}
