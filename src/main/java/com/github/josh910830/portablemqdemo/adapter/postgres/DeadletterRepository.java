package com.github.josh910830.portablemqdemo.adapter.postgres;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DeadletterRepository extends JpaRepository<DeadletterEntity, String> {
}
