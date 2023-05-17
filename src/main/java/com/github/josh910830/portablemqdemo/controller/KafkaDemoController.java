package com.github.josh910830.portablemqdemo.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/kafka")
@RequiredArgsConstructor
public class KafkaDemoController {

    @PostMapping("/demo")
    public void demo() {
        log.info("demo");
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