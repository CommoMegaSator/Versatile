package com.versatile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

import static com.versatile.util.Constants.KAFKA_TOPIC_NAME;

@SpringBootApplication
public class VersatileApplication {
	public static void main(String[] args) {
		SpringApplication.run(VersatileApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(KafkaTemplate<String, String> kafkaTemplate) {
		return args -> kafkaTemplate.send(KAFKA_TOPIC_NAME, "Start");
	}
}
