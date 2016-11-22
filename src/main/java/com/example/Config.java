package com.example;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("dev")
@Configuration
public class Config {

	static {
		System.out.println("config");
	}
}
