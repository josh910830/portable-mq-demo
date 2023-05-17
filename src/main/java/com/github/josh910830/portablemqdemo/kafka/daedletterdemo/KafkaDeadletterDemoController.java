package com.github.josh910830.portablemqdemo.kafka.daedletterdemo;

import com.github.josh910830.portablemq.core.producer.PortableProducer;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@Slf4j
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaDeadletterDemoController {

    private final PortableProducer<KafkaDeadletterDemoMessage> deadletterDemoMessageProducer;

    @PostMapping("/deadletter-demo")
    public void post() {
        log.info("post");
        deadletterDemoMessageProducer.produce(new KafkaDeadletterDemoMessage(UUID.randomUUID().toString(), "deadletter-demo"));
    }

}
