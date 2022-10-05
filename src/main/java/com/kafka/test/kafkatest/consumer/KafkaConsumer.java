package com.kafka.test.kafkatest.consumer;

import com.kafka.test.kafkatest.model.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {

    @KafkaListener(topics="test-topic-1", groupId = "${spring.kafka.consumer.group-id}")
    public void consume(Message message, Acknowledgment ack) {
        System.out.println("recieved : "+message);
    }
}
