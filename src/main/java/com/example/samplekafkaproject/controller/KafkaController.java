package com.example.samplekafkaproject.controller;

import com.example.samplekafkaproject.service.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private MessageProducer messageProducer;

    @GetMapping("/send")
    public String sendMessage(@RequestParam("message") String message) {
        messageProducer.sendMessage(message);
        return "Message sent by Producer : " + message;
    }
}