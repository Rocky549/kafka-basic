package com.rocky.kafkabasic.controller;

import com.rocky.kafkabasic.producer.SimpleMsgProducer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/api/kafka/msg/")
public class BasicMsgController {

    private SimpleMsgProducer simpleMsgProducer;

    public BasicMsgController(SimpleMsgProducer simpleMsgProducer) {
        this.simpleMsgProducer = simpleMsgProducer;
    }

   // http://localhost:9090/api/kafka/msg/publish/Hello Rocky
   @GetMapping(value = "/publish/{msg}")
   public ResponseEntity<String> publish(@PathVariable String msg){
        simpleMsgProducer.sendMessage(msg);
        return ResponseEntity.status(HttpStatus.OK).body("The message "+msg+" pulished successfully");
   }
}
