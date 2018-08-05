package cn.krynn.order.controller;

import cn.krynn.order.message.StreamClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.messaging.support.MessageBuilder;

import java.util.Date;

/**
 * Created by RaistlinD
 * 2018/8/5 下午11:30
 */
@RestController
public class SendMessageController {

    @Autowired
    private StreamClient streamClient;
    @GetMapping("/sendMessage")
    public void process() {
        String message = "new " + new Date();
        streamClient.output().send(MessageBuilder.withPayload(message).build());

    }
}
