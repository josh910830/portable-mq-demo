package com.github.josh910830.portablemqdemo.kafka.daedletterdemo;

import com.github.josh910830.portablemq.core.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaDeadletterDemoMessage implements Message {

    private String id;
    private String content;

}
