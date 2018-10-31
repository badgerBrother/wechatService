package com.badgerBrother.wechatService.conf;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    private static final String fanoutExchange = "fanout-exchange";
    private static final String queueName = "myqueue";

    @Bean
    public FanoutExchange fanoutExchange(){
        return new FanoutExchange(fanoutExchange);
    }

    @Bean
    public Queue queue(){
        return new Queue(queueName);
    }

    @Bean
    public Binding fanoutBinding(Queue queue, FanoutExchange fanoutExchange){
        return BindingBuilder.bind(queue).to(fanoutExchange);
    }
}
