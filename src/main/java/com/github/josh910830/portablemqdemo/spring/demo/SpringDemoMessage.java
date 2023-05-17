package com.github.josh910830.portablemqdemo.spring.demo;

import com.github.josh910830.portablemq.core.message.Message;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SpringDemoMessage implements Message {

    private String id;
    private String content;

}
