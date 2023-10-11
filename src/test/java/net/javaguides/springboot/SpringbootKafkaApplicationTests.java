package net.javaguides.springboot;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootKafkaApplicationTests {

    @Autowired
    private StringKafkaProducer stringKafkaProducer;

    @Test
    void testStringSerialize() {
		stringKafkaProducer.sendMessage("hello world");
    }
}
