package com.github.josh910830.portablemqdemo.spring.demo;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.spring.producer.SpringProducer;

import static com.github.josh910830.portablemqdemo.Topics.SPRING_DEMO;

@Producer(topic = SPRING_DEMO)
public class SpringDemoProducer implements SpringProducer<SpringDemoMessage> {}
