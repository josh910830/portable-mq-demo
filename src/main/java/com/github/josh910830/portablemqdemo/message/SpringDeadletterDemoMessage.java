package com.github.josh910830.portablemqdemo.message;

import com.github.josh910830.portablemq.core.message.IdentifiableMessage;
import lombok.Getter;
import lombok.ToString;

@ToString
public class SpringDeadletterDemoMessage extends IdentifiableMessage {

    @Getter
    private final String content;

    public SpringDeadletterDemoMessage(String content) {
        this.content = content;
    }

}
