package com.github.josh910830.portablemqdemo.kafka.badletterdemo;

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
public class KafkaBadletterDemoController {

    private final PortableProducer<KafkaBadletterDemoMessage> badletterDemoMessageProducer;

    @PostMapping("/badletter-demo")
    public void post() {
        log.info("post");
        badletterDemoMessageProducer.produce(new KafkaBadletterDemoMessage(UUID.randomUUID().toString(), "badletter-demo"));
    }

}
