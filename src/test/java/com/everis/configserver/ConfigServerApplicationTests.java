package com.everis.configserver;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest(classes = {ConfigServerApplication.class})
class ConfigServerApplicationTests {

	@Test
	public void contextLoads() {
		assertTrue(true);
	}

}
