package com.itheima.user.mq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Component
public class SpringRabbitListener {
    @RabbitListener(queues = "sim.queue")
    public void listenSimpleQueueMessage(String msg) throws InterruptedException {
        System.out.println("恭喜您 ，您的订单: {订单编号}  已经创建成功！！"+msg);
    }
}
