package com.github.josh910830.portablemqdemo.consumer;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.spring.consumer.SpringListener;
import com.github.josh910830.portablemq.support.utility.Chaoses;
import com.github.josh910830.portablemqdemo.message.SpringDeadletterDemoMessage;
import com.github.josh910830.portablemqdemo.message.SpringDemoMessage;
import lombok.extern.slf4j.Slf4j;

import static com.github.josh910830.portablemqdemo.topic.Topics.SPRING_DEADLETTER_DEMO;
import static com.github.josh910830.portablemqdemo.topic.Topics.SPRING_DEMO;

@Slf4j
@Consumer
public class SpringDemoConsumer {

    @Consume
    @SpringListener(topic = SPRING_DEMO)
    public void demo(SpringDemoMessage message) {
        log.info("consume {}", message);
    }

    private final Chaoses.Toggle toggle = new Chaoses.Toggle(true);

    @Consume
    @SpringListener(topic = SPRING_DEADLETTER_DEMO)
    public void deadletterDemo(SpringDeadletterDemoMessage message) {
        log.info("consume {}", message);
        toggle.push();
    }

}
