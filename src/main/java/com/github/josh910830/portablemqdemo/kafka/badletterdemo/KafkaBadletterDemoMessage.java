package com.github.josh910830.portablemqdemo.kafka.badletterdemo;

import com.github.josh910830.portablemq.core.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaBadletterDemoMessage implements Message {

    private String id;
    private String content;

}
