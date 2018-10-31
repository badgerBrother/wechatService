package com.badgerBrother.wechatService.tasks;

import org.springframework.amqp.rabbit.annotation.RabbitListener;

public class Consumer {

    @RabbitListener(queues = "myqueue")
    public void processMessage(String msg){
        System.out.printf("处理消息："+msg);
    }
}
