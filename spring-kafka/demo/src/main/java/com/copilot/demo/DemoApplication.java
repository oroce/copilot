package com.copilot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.config.TopicBuilder;
import org.springframework.stereotype.Service;

// how to change kafka connection to localhost:29092
// how do you configure spring application to use kafka bootstrap server at localhost:29092?
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Service
	public class KafkaConsumer {

		@KafkaListener(topics = "user.created", groupId = "group_id")
		public void consume(String message) {
			System.out.println("Consumed message: " + message);
		}



	}
}
