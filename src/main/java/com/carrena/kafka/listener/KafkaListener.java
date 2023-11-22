package com.carrena.kafka.listener;

import org.springframework.stereotype.Component;

@Component
public class KafkaListener {
    @org.springframework.kafka.annotation.KafkaListener(topics="carrena_topic", groupId = "carrena")
    void listener(String data){
        System.out.println("Listener recevied : " + data);
    }
}
