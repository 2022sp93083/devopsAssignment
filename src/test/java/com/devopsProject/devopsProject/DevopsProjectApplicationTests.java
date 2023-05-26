package com.devopsProject.devopsProject;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DevopsProjectApplicationTests {
	int a= 4;

	@Test
	void contextLoads() {
		assertEquals(4,a);
	}

}
