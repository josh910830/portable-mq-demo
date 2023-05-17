package com.github.josh910830.portablemqdemo.kafka.badletterdemo;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.kafka.consumer.Handle;
import com.github.josh910830.portablemq.kafka.consumer.Parse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_BADLETTER_DEMO;

@Slf4j
@Consumer
public class KafkaBadletterDemoConsumer {

    @Consume(useBadletter = true)
    @KafkaListener(topics = KAFKA_BADLETTER_DEMO)
    public void consume(String data, Acknowledgment ack) {
        log.info("consume {}", data);
    }

    @Parse
    public KafkaBadletterDemoMessage parse(String data) {
        log.info("parse {}", data);
        throw new RuntimeException("parse");
    }

    @Handle
    public void handle(KafkaBadletterDemoMessage message) {
        log.info("handle {}", message);
    }

}
