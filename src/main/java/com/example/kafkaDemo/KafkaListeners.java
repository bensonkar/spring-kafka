package com.example.kafkaDemo;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "mytopic", groupId = "mytopicGID")
    void listener(String data) {
        System.out.println("Listener Received data from producer:  "+data);
    }
}
