package com.rocky.kafkabasic.consumer;

import com.rocky.kafkabasic.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class JsonConsumer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonConsumer.class);

    @KafkaListener(topics = "empJson",groupId = "simpleMsgGroup")
    public void consume(Employee emp){
        System.out.println(emp.toString());
        LOGGER.info("The message received by consumer is ===== "+emp.toString());
    }


}
