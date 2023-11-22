package com.carrena.kafka;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.core.KafkaTemplate;

@SpringBootApplication
public class KafkaApplication {
	public static void main(String[] args) {
		SpringApplication.run(KafkaApplication.class, args);
	}

//	@Bean
//	CommandLineRunner clr(KafkaTemplate<String, String> kt){
//		return args -> {
//			for (int i = 1; i < 100; i++) {
//				kt.send("carrena_topic","hello word " + i );
//			}
//		};
//	}
}

