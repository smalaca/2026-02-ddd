package com.smalaca.opentrainingsale.domain.training;

import java.util.UUID;

// value object
public class TrainingDefinitionId {
    private final UUID trainingDefinitionId;

    public TrainingDefinitionId(UUID trainingDefinitionId) {
        this.trainingDefinitionId = trainingDefinitionId;
    }
}
