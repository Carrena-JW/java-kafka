package com.carrena.kafka.controller;

import com.carrena.kafka.request.MessageRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MessageController {
    private final KafkaTemplate<String, String> kt;

    @PostMapping("/api/v1/kafka/publish")
    public void Publish(@RequestBody MessageRequest reqeust){
        kt.send("carrena_topic", reqeust.message());
    }
}
