package com.github.josh910830.portablemqdemo.producer;

import com.github.josh910830.portablemq.core.producer.Producer;
import com.github.josh910830.portablemq.spring.producer.SpringProducer;
import com.github.josh910830.portablemqdemo.message.SpringDemoMessage;

import static com.github.josh910830.portablemqdemo.topic.Topics.SPRING_DEMO;

@Producer(topic = SPRING_DEMO)
public class SpringDemoProducer implements SpringProducer<SpringDemoMessage> {}
