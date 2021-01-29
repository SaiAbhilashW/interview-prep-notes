package com.rabbitmqapp.code;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RabbitmqworkApplication implements CommandLineRunner {
	
	@Autowired
	private RabbitTemplate rabbitTemplate;
	public static void main(String[] args) {
		SpringApplication.run(RabbitmqworkApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		//class of message object needs to implement Serializable interface
		//because under the hood SimpleMessageConverter class converts the objects to binary and sends it to MQ 
		SimpleMessage msg = new SimpleMessage();
		for(int i = 0; i < 10; i++) {
			msg.setName("Message : " + i);
			rabbitTemplate.convertAndSend("myTopicExchange", "topic", msg);
		}
//		msg.setDescription("simple description");
		
		//rabbitTemplate.convertAndSend("testExchange", "routingKey", "This is my first MQ message");
	}
}
