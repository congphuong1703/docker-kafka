package com.cmcglobal.resourcemanagement.domain.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

    @KafkaListener(topics = "mytopic", groupId = "mygroup")
    public void consumeFromTopic(String message) {
        System.out.println("Consumed message " + message);
    }
}
