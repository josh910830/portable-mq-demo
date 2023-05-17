package com.github.josh910830.portablemqdemo.adapter.redis;

import com.github.josh910830.portablemq.core.consumer.log.ConsumptionLog;
import com.github.josh910830.portablemq.core.consumer.log.interfaces.ConsumptionLogStore;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RedisConsumptionLogStore implements ConsumptionLogStore {

    private final ConsumptionLogRepository consumptionLogRepository;


    @Override
    public boolean exists(@NotNull String groupId, @NotNull String messageId) {
        String id = groupId + "::" + messageId;
        return consumptionLogRepository.existsById(id);
    }

    @Override
    public void save(@NotNull ConsumptionLog consumptionLog) {
        String id = consumptionLog.getGroupId() + "::" + consumptionLog.getMessage().getId();
        consumptionLogRepository.save(new ConsumptionLogHash(id));
    }

}
