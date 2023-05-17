package com.github.josh910830.portablemqdemo.kafka.demo;

import com.github.josh910830.portablemq.core.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class KafkaDemoMessage implements Message {

    private String id;
    private String content;

}
