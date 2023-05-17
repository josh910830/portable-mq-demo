package com.github.josh910830.portablemqdemo.adapter.log;

import com.github.josh910830.portablemq.core.consumer.deadletter.Deadletter;
import com.github.josh910830.portablemq.support.template.DeadletterLinkNotifier;
import lombok.extern.slf4j.Slf4j;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogDeadletterNotifier extends DeadletterLinkNotifier {

    @NotNull
    @Override
    protected String getServerAddress() {
        return "localhost";
    }

    @Override
    protected void doNotify(@NotNull Deadletter deadletter, @NotNull Exception exception, @NotNull String redriveLink) {
        log.info("redriveLink: " + redriveLink);
    }

}
