package cn.krynn.order.message;

import cn.krynn.order.dto.OrderDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Component;

/**
 * Created by RaistlinD
 * 2018/8/5 下午11:27
 */
@Component
@EnableBinding(StreamClient.class)
@Slf4j
public class StreamReceiver {

//    @StreamListener(StreamClient.INPUT)
//    public void process(Object message) {
//        log.info("StreamReceiver: {}", message);
//    }

    /**
     * 接收orderDTO对象 消息
     * @param message
     */
    @StreamListener(StreamClient.INPUT)
    public void process(OrderDTO message) {
        log.info("StreamReceiver: {}", message);
    }
}
