package com.github.josh910830.portablemqdemo.producer;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.kafka.producer.KafkaProducer;
import com.github.josh910830.portablemqdemo.message.KafkaDemoMessage;

import static com.github.josh910830.portablemqdemo.topic.Topics.KAFKA_DEMO;

@Producer(topic = KAFKA_DEMO)
public class KafkaDemoProducer implements KafkaProducer<KafkaDemoMessage> {}
