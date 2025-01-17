package com.omardiop.omardiop;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    // Kafka listener for events from the 'events' topic
    @KafkaListener(topics = "omardiop",groupId = "foo")
    public void listen(String message) {
        System.out.println("Received Messasge in group foo: " + message +"📩");
    }
}
