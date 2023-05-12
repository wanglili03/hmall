package com.itheima.user.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author lijinwang
 * @date 2023/5/12
 * @apiNote
 */
@Configuration
public class BasicConfig {
    @Bean
    public Queue basicQueue(){
        return new Queue("sim.queue");
    }

}
