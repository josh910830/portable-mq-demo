package com.github.josh910830.portablemqdemo.kafka.daedletterdemo;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.kafka.consumer.Handle;
import com.github.josh910830.portablemq.support.utility.Chaoses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_DEADLETTER_DEMO;

@Slf4j
@Consumer
public class KafkaDeadletterDemoConsumer {

    private final Chaoses.Toggle toggle = new Chaoses.Toggle(true);


    @Consume
    @KafkaListener(topics = KAFKA_DEADLETTER_DEMO)
    public void consume(String data, Acknowledgment ack) {
        log.info("consume {}", data);
    }

    @Handle
    public void handle(KafkaDeadletterDemoMessage message) {
        log.info("handle {}", message);
        toggle.push();
    }

}
