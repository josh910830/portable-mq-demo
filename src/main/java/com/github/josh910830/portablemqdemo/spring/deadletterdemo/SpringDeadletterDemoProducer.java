package com.github.josh910830.portablemqdemo.spring.deadletterdemo;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.spring.producer.SpringProducer;

import static com.github.josh910830.portablemqdemo.Topics.SPRING_DEADLETTER_DEMO;

@Producer(topic = SPRING_DEADLETTER_DEMO)
public class SpringDeadletterDemoProducer implements SpringProducer<SpringDeadletterDemoMessage> {}
