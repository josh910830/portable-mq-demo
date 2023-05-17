package com.github.josh910830.portablemqdemo.kafka.daedletterdemo;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.kafka.producer.KafkaProducer;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_DEADLETTER_DEMO;

@Producer(topic = KAFKA_DEADLETTER_DEMO)
public class KafkaDeadletterDemoProducer implements KafkaProducer<KafkaDeadletterDemoMessage> {
}
