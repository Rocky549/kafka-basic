package com.rocky.kafkabasic.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleMsgConsumer {

    public static final Logger LOGGER= LoggerFactory.getLogger(SimpleMsgConsumer.class);
    //private KafkaTemplate<String,String> kafkaTemplate;

//    public SimpleMsgConsumer(KafkaTemplate<String, String> kafkaTemplate) {
//        this.kafkaTemplate = kafkaTemplate;
//    }

    @KafkaListener(topics = "simpleMsg",groupId = "simpleMsgGroup")
    public void consume(String msg){
       LOGGER.info("The message received by consumer is ===== "+msg);
    }
}
