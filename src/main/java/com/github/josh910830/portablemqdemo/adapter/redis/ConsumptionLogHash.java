package com.github.josh910830.portablemqdemo.adapter.redis;

import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash(timeToLive = 24 * 60 * 60)
@AllArgsConstructor
public class ConsumptionLogHash {
    @Id
    private String id;
}
