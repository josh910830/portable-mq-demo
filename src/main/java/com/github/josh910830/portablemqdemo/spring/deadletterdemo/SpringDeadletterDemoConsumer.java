package com.github.josh910830.portablemqdemo.spring.deadletterdemo;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.spring.consumer.SpringListener;
import com.github.josh910830.portablemq.support.utility.Chaoses;
import lombok.extern.slf4j.Slf4j;

import static com.github.josh910830.portablemqdemo.Topics.SPRING_DEADLETTER_DEMO;

@Slf4j
@Consumer
public class SpringDeadletterDemoConsumer {

    private final Chaoses.Toggle toggle = new Chaoses.Toggle(true);

    @Consume
    @SpringListener(topic = SPRING_DEADLETTER_DEMO)
    public void consume(SpringDeadletterDemoMessage message) {
        log.info("consume {}", message);
        toggle.push();
    }

}
