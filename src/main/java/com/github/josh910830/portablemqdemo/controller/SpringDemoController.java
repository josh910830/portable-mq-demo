package com.github.josh910830.portablemqdemo.controller;

import com.github.josh910830.portablemq.core.producer.PortableProducer;
import com.github.josh910830.portablemqdemo.message.SpringDeadletterDemoMessage;
import com.github.josh910830.portablemqdemo.message.SpringDemoMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/spring")
@RequiredArgsConstructor
public class SpringDemoController {

    private final PortableProducer<SpringDemoMessage> demoMessageProducer;
    private final PortableProducer<SpringDeadletterDemoMessage> deadletterDemoMessageProducer;

    @PostMapping("/demo")
    public void demo() {
        log.info("demo");
        demoMessageProducer.produce(new SpringDemoMessage("demo"));
    }

    @PostMapping("/deadletter-demo")
    public void deadletterDemo() {
        log.info("deadletterDemo");
        deadletterDemoMessageProducer.produce(new SpringDeadletterDemoMessage("deadletter-demo"));
    }

}
