package com.github.josh910830.portablemqdemo.kafka.demo;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.kafka.producer.KafkaProducer;

import static com.github.josh910830.portablemqdemo.Topics.KAFKA_DEMO;

@Producer(topic = KAFKA_DEMO)
public class KafkaDemoProducer implements KafkaProducer<KafkaDemoMessage> {}
