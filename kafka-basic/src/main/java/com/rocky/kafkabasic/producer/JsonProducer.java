package com.rocky.kafkabasic.producer;

import com.rocky.kafkabasic.entities.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
public class JsonProducer {

    private static final Logger LOGGER= LoggerFactory.getLogger(JsonProducer.class);

    private KafkaTemplate<String, Employee> kafkaTemplate;

    public JsonProducer(KafkaTemplate<String, Employee> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }


    public void sendMessage(Employee emp){
        LOGGER.info(String.format("The Json Message is ===> %s",emp.toString()));
        Message msg= MessageBuilder.withPayload(emp)
                .setHeader(KafkaHeaders.TOPIC,"empJson").build();
        kafkaTemplate.send("empJson",emp);
    }

}
