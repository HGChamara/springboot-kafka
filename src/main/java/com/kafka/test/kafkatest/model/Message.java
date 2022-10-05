package com.kafka.test.kafkatest.model;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Message {
    private UUID id;
    private String message;
}
