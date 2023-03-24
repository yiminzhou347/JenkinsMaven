package com.example.day2Maven;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Day2MavenApplication implements CommandLineRunner {
	public static final Logger logger= LoggerFactory.getLogger(Day2MavenApplication.class);

	public static void main(String[] args) {
		logger.info("It is a continuous integration job!!!");
		SpringApplication.run(Day2MavenApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("It is my second logger!");
	}

}
