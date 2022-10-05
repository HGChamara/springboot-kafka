package com.kafka.test.kafkatest;

import com.kafka.test.kafkatest.consumer.KafkaConsumer;
import com.kafka.test.kafkatest.model.Message;
import com.kafka.test.kafkatest.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.UUID;

@SpringBootApplication
public class KafkatestApplication {

	@Autowired
	Producer producer;

	@Autowired
	KafkaConsumer consumer;

	public static void main(String[] args) {
		SpringApplication.run(KafkatestApplication.class, args);
	}

	@PostConstruct
	public void kafkaTest(){

		Message message = new Message(UUID.randomUUID(), "test message a");
		Message message2 = new Message(UUID.randomUUID(), "test message 2");
		producer.produce("test-topic-1",message);
		//producer.produce("topic2",message2);
	}

}
