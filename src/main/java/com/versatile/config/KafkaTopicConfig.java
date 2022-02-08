package com.versatile.config;

import com.versatile.util.Constants;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {
    @Bean
    public NewTopic someTopic() {
        return TopicBuilder.name(Constants.KAFKA_TOPIC_NAME)
                .build();
    }
}
