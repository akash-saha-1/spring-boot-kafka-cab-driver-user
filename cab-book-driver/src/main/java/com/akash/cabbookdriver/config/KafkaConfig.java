package com.akash.cabbookdriver.config;

import com.akash.cabbookdriver.constant.AppConstant;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {

    @Bean
    public NewTopic cabLocationTopic() {
        return TopicBuilder.name(AppConstant.CAB_LOCATION).build();
    }
}
