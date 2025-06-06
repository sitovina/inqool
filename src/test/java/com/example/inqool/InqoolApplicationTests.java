package com.example.inqool;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class InqoolApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
    void test() throws Exception {
		assertThat("hello").doesNotContain("world");
	}
}
