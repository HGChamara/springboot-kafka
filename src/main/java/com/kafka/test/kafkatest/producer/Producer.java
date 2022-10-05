package com.kafka.test.kafkatest.producer;

import com.kafka.test.kafkatest.model.Message;

public interface Producer {

    public void produce( String topic, Message message );

}
