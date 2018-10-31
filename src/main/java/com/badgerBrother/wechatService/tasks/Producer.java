package com.badgerBrother.wechatService.tasks;

import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Producer {

    @Autowired
    private AmqpTemplate amqpTemplate;
    @Autowired
    private AmqpAdmin  amqpAdmin;

    public void sendExangeMessage(String exangeName, String routingKey, String msg){
        amqpTemplate.convertAndSend(exangeName,routingKey,msg);
    }
}
