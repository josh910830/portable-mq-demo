package com.github.josh910830.portablemqdemo.kafka.demo;

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
public class KafkaDemoController {

    private final PortableProducer<KafkaDemoMessage> demoMessageProducer;

    @PostMapping("/demo")
    public void demo() {
        log.info("demo");
        demoMessageProducer.produce(new KafkaDemoMessage(UUID.randomUUID().toString(), "demo"));
    }

    @PostMapping("/deadletter-demo")
    public void deadletterDemo() {
        log.info("deadletterDemo");
    }

    @PostMapping("/badletter-demo")
    public void badletterDemo() {
        log.info("badletterDemo");
    }

}
