package com.versatile.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class KafkaListeners {

    @KafkaListener(
            topics = Constants.KAFKA_TOPIC_NAME,
            groupId = "group")
    public String listener(String data) {
        log.info("Listener received: " + data);
        return data;
    }
}
