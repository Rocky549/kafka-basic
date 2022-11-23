package com.rocky.kafkabasic.controller;

import com.rocky.kafkabasic.entities.Employee;
import com.rocky.kafkabasic.producer.JsonProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app1/jsonmsg/emp")
public class JsonMsgController {

    private JsonProducer jsonProducer;

    public JsonMsgController(JsonProducer jsonProducer) {
        this.jsonProducer = jsonProducer;
    }

    @PostMapping(value = "/",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Employee> sendEmployee(@RequestBody Employee emp){
        jsonProducer.sendMessage(emp);
        return  ResponseEntity.status(HttpStatus.CREATED).body(emp);
    }
}
