package com.github.josh910830.portablemqdemo.spring.demo;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.spring.consumer.SpringListener;
import lombok.extern.slf4j.Slf4j;

import static com.github.josh910830.portablemqdemo.Topics.SPRING_DEMO;

@Slf4j
@Consumer
public class SpringDemoConsumer {

    @Consume
    @SpringListener(topic = SPRING_DEMO)
    public void consume(SpringDemoMessage message) {
        log.info("consume {}", message);
    }

}
