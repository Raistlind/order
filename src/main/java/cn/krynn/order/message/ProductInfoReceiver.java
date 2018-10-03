package cn.krynn.order.message;

import cn.krynn.order.dataobject.ProductInfoOutput;
import cn.krynn.order.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * Created by RaistlinD
 * 2018/10/3 12:35 AM
 */
@Component
@Slf4j
public class ProductInfoReceiver {

    @RabbitListener(queuesToDeclare = @Queue("productInfo"))
    public void process(String message) {
        ProductInfoOutput productInfoOutput = (ProductInfoOutput) JsonUtil.fromJson(message, ProductInfoOutput.class);
        log.info("从队列【{}】接收到的消息：{}", "productInfo", productInfoOutput);

        //存储到Redis

    }
}
