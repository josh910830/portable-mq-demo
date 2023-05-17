package com.github.josh910830.portablemqdemo.spring.deadletterdemo;

import com.github.josh910830.portablemq.core.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpringDeadletterDemoMessage implements Message {

    private String id;
    private String content;

}
