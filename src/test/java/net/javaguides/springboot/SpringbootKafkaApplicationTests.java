package net.javaguides.springboot;

import net.javaguides.springboot.kafka.KafkaProducer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootKafkaApplicationTests {

    @Autowired
    private KafkaProducer kafkaProducer;

    @Test
    void testStringSerialize() {
		kafkaProducer.sendMessage("hello world");
    }
}
