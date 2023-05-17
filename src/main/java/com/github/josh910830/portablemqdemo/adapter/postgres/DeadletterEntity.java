package com.github.josh910830.portablemqdemo.adapter.postgres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class DeadletterEntity {

    @Id
    private String id;

    @Getter
    @Column(columnDefinition = "TEXT")
    private String json;

}
