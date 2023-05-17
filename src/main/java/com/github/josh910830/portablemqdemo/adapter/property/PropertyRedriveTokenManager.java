package com.github.josh910830.portablemqdemo.adapter.property;

import com.github.josh910830.portablemq.core.consumer.deadletter.interfaces.RedriveTokenManager;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PropertyRedriveTokenManager implements RedriveTokenManager {

    @Value("${token}")
    private String token;

    @Override
    public boolean authenticate(@NotNull String deadletterId, @NotNull String redriveToken) {
        return redriveToken.equals(token);
    }

    @NotNull
    @Override
    public String issue(@NotNull String deadletterId) {
        return token;
    }

}
