package com.itheima.user.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Component
public class SpringRabbitListener {
    @RabbitListener(queues = "sim.queue")
    public void listenSimpleQueueMessage(Map<String,Object> map) throws InterruptedException {
        String str = String.format("恭喜您 %s 先生/女士，您的订单: %s  已经创建成功！！", map.get("username"), map.get("orderId")+"");
        System.out.println(str);
    }
}
