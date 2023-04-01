package com.vishnu.java.kafka.javakafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> template;

    @GetMapping("/health")
    public String health() {
        return "Up and running";
    }

    @GetMapping("/produce/{message}")
    public void produce(@PathVariable String message) {
        System.out.println("Producing message ...");
        this.template.send("my-topic", message);
        System.out.println("Message sent ...");
    }
    
}
