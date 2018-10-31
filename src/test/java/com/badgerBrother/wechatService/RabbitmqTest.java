package com.badgerBrother.wechatService;

import com.badgerBrother.wechatService.tasks.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = WechatServiceApplication.class)
public class RabbitmqTest {

    @Autowired
    private Producer producer;

    @Test
    public void sendExangeMsg(){
        producer.sendExangeMessage("fanout-exchange","","123");
        System.out.println("完成");
    }
}
