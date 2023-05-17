package com.github.josh910830.portablemqdemo.kafka.badletterdemo;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.kafka.producer.KafkaProducer;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_BADLETTER_DEMO;

@Producer(topic = KAFKA_BADLETTER_DEMO)
public class KafkaBadletterDemoProducer implements KafkaProducer<KafkaBadletterDemoMessage> {
}
