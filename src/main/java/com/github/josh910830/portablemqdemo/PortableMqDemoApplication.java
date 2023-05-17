package com.github.josh910830.portablemqdemo;

import com.github.josh910830.portablemq.EnablePortableMQ;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnablePortableMQ
@SpringBootApplication
public class PortableMqDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PortableMqDemoApplication.class, args);
    }

}
