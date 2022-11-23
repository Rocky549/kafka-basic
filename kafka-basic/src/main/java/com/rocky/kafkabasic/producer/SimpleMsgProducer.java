package com.rocky.kafkabasic.producer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class SimpleMsgProducer {

    private static  final Logger LOGGER=LoggerFactory.getLogger(SimpleMsgProducer.class);
    private KafkaTemplate<String,String> kafkaTemplate;

    private SimpleMsgProducer(KafkaTemplate<String,String> kafkaTemplate){
        this.kafkaTemplate=kafkaTemplate;
    }

    public void sendMessage(String msg){
        LOGGER.info("the sendMesage method message is======="+msg);
        kafkaTemplate.send("simpleMsg",msg);
    }
}
