package com.github.josh910830.portablemqdemo.spring.demo;

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
public class SpringDemoController {

    private final PortableProducer<SpringDemoMessage> demoMessageProducer;

    @PostMapping("/demo")
    public void post() {
        log.info("post");
        demoMessageProducer.produce(new SpringDemoMessage(UUID.randomUUID().toString(), "demo"));
    }

}
