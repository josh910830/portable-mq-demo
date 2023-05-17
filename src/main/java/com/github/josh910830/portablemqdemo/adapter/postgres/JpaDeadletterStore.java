package com.github.josh910830.portablemqdemo.adapter.postgres;

import com.github.josh910830.portablemq.support.template.DeadletterJsonStore;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class JpaDeadletterStore extends DeadletterJsonStore {

    private final DeadletterRepository deadletterRepository;


    @NotNull
    @Override
    public List<String> doFindAll() {
        return deadletterRepository.findAll()
            .stream().map(DeadletterEntity::getJson).toList();
    }

    @NotNull
    @Override
    public String doFindById(@NotNull String deadletterId) {
        return deadletterRepository.findById(deadletterId)
            .map(DeadletterEntity::getJson).orElseThrow();
    }

    @Override
    public void doSave(@NotNull String deadletterId, @NotNull String json) {
        deadletterRepository.save(new DeadletterEntity(deadletterId, json));
    }

    @Override
    public void clear() {
        deadletterRepository.deleteAll();
    }

    @Override
    public void deleteById(@NotNull String deadletterId) {
        deadletterRepository.deleteById(deadletterId);
    }

}
