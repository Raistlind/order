package cn.krynn.order.message;

import cn.krynn.order.OrderApplicationTests;
import cn.krynn.order.dto.OrderDTO;
import org.junit.Test;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * 发送MQ消息测试
 * Created by RaistlinD
 * 2018/8/4 下午11:46
 */
@Component
public class MqReceiverTest extends OrderApplicationTests {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @Test
    public void send() {
        amqpTemplate.convertAndSend("myQueue", "now " + new Date());
    }

    @Test
    public void sendOrder() {
        amqpTemplate.convertAndSend("myOrder","computer", "now " + new Date());
    }


}