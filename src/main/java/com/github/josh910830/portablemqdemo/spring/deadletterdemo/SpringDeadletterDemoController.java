package com.github.josh910830.portablemqdemo.spring.deadletterdemo;

import com.github.josh910830.portablemq.core.producer.PortableProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/spring")
@RequiredArgsConstructor
public class SpringDeadletterDemoController {

    private final PortableProducer<SpringDeadletterDemoMessage> deadletterDemoMessageProducer;

    @PostMapping("/deadletter-demo")
    public void post() {
        log.info("post");
        deadletterDemoMessageProducer.produce(new SpringDeadletterDemoMessage(UUID.randomUUID().toString(), "deadletter-demo"));
    }

}
