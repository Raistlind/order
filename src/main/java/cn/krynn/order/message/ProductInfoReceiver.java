package cn.krynn.order.message;

import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by RaistlinD
 * 2018/10/3 12:35 AM
 */
@Component
public class ProductInfoReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        
    }
}
