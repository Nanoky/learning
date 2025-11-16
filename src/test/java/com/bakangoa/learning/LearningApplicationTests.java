package com.bakangoa.learning;

import com.bakangoa.learning.model.HelloWorld;
import com.bakangoa.learning.service.HelloWorldBusiness;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class LearningApplicationTests {
    @Autowired
    private HelloWorldBusiness bs;

	@Test
	void contextLoads() {
	}

    @Test
    void testGetHelloWorldHelloWorldSayHelloWorld() {
        HelloWorld  hw = bs.getHelloWorld();

        boolean isSayingHW = hw.isMessageEqual("Hello World!");

        assertTrue(isSayingHW);
    }
}
