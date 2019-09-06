package com.vk.spring.drasticketing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.vk"})
public class DrasTicketingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DrasTicketingApplication.class, args);
	}

}
