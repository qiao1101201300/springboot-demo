package com.qs.springboot.mq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SimpleSender {
    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(String message) {
        Map<String,Object> map = new HashMap<>();
        map.put("value",message);
        amqpTemplate.convertAndSend("test",map);
    }
}
