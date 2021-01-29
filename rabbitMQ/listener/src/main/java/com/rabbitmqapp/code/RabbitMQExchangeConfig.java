package com.rabbitmqapp.code;

import org.springframework.amqp.core.Exchange;
import org.springframework.amqp.core.ExchangeBuilder;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQExchangeConfig {

	@Bean
	Exchange exampleExchange() {
		return new TopicExchange("simpleExchange");
	}
	
	@Bean
	Exchange builderExchange() {
		return ExchangeBuilder.directExchange("builderExchange")
				.autoDelete()
				.internal()
				.build();
	}
	
	@Bean
	Exchange topicExchange() {
		return ExchangeBuilder.topicExchange("topicTestExchange")
				.autoDelete()
				.durable(true)
				.internal()
				.build();
	}
	
	@Bean
	Exchange fanout() {
		return ExchangeBuilder.fanoutExchange("fanoutTestExchange")
				.autoDelete()
				.durable(true)
				.internal()
				.build();
	}
	
	@Bean
	Exchange headersExchange() {
		return ExchangeBuilder.headersExchange("headersTestExchange")
				.ignoreDeclarationExceptions()
				.durable(true)
				.internal()
				.build();
	}
}
