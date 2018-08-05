package cn.krynn.order.message;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 接收mq消息
 * Created by RaistlinD
 * 2018/8/4 下午11:39
 */
@Slf4j
@Component
public class MqReceiver {

    //1.使用手工创建的队列：@RabbitListener(queues = "myQueue")
    //2.需要自动创建队列：@RabbitListener(queuesToDeclare = @Queue("myQueue"))
    //3.自动创建，Exchange和Queue绑定
    @RabbitListener(bindings = @QueueBinding(
            value = @Queue("myQueue"),
            exchange = @Exchange("myExchange")
    ))
    public void process(String message) {
        System.out.println("MqReceiver: "+ message);
        log.info("MqReceiver: {}", message);
    }

    /**
     * 电脑供应商服务接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "computer",
            value = @Queue("computerOrder")
    ))
    public void processComputer(String message) {
        System.out.println("computer MqReceiver: "+ message);
        log.info("computer MqReceiver: {}", message);
    }

    /**
     * 水果供应商服务接收消息
     * @param message
     */
    @RabbitListener(bindings = @QueueBinding(
            exchange = @Exchange("myOrder"),
            key = "fruit",
            value = @Queue("fruitOrder")
    ))
    public void processFruit(String message) {
        System.out.println("fruit MqReceiver: "+ message);
        log.info("fruit MqReceiver: {}", message);
    }
}
