package com.github.josh910830.portablemqdemo.message;

import com.github.josh910830.portablemq.core.message.IdentifiableMessage;
import lombok.Getter;
import lombok.ToString;

@ToString
public class SpringDemoMessage extends IdentifiableMessage {

    @Getter
    private final String content;

    public SpringDemoMessage(String content) {
        this.content = content;
    }

}
