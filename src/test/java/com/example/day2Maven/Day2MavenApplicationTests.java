package com.example.day2Maven;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Day2MavenApplicationTests {
	public static final Logger logger = LoggerFactory.getLogger(Day2MavenApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("It is a test class!");
		assertEquals(true,true);
	}

}
