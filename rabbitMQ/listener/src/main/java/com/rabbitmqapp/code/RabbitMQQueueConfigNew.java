package com.rabbitmqapp.code;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.QueueBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//delcaration of queue using queueBuilder

@Configuration
public class RabbitMQQueueConfigNew {
//	@Bean
//	Queue aNewQueue() {
//		return QueueBuilder.durable("usingQueueBuilder")
//				.autoDelete()
//				.exclusive()
//				.build();
//	}
}
	