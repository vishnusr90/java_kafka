package com.vishnu.java.kafka.javakafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping()
    public String health() {
        return "Up and running";
    }

    @GetMapping
    public void produce(String message) {
        this.template.send("my-topic", message);
    }
    
}
