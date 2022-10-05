package com.kafka.test.kafkatest.producer;

import com.kafka.test.kafkatest.model.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer implements Producer {

    @Autowired
    private KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void produce(String topic, Message message) {
        this.kafkaTemplate.send(topic, message);
    }
}
