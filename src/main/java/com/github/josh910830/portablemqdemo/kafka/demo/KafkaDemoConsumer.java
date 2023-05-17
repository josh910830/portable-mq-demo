package com.github.josh910830.portablemqdemo.kafka.demo;

import com.github.josh910830.portablemq.core.consumer.Consume;
import com.github.josh910830.portablemq.core.consumer.Consumer;
import com.github.josh910830.portablemq.kafka.consumer.Handle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_DEMO;

@Slf4j
@Consumer
public class KafkaDemoConsumer {

    @Consume
    @KafkaListener(topics = KAFKA_DEMO)
    public void demo(String data, Acknowledgment ack) {
        log.info("consume {}", data);
    }

    @Handle
    public void handleDemo(KafkaDemoMessage message) {
        log.info("handle {}", message);
    }

}
