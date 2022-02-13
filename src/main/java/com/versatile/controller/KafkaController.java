package com.versatile.controller;

import com.versatile.util.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("kafka")
public class KafkaController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping()
    public ResponseEntity<?> publish(@RequestParam(name = "message") String message) {
        kafkaTemplate.send(Constants.KAFKA_TOPIC_NAME, message);
        return new ResponseEntity<>("", HttpStatus.CREATED);
    }
}
