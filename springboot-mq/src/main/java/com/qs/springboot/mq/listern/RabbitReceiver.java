package com.qs.springboot.mq.listern;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "test")
public class RabbitReceiver {
    @RabbitHandler
    public void process(Object testMessage) {
        System.out.println("Message content : " + testMessage);
    }
}
