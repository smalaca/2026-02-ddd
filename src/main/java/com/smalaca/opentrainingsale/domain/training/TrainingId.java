package com.smalaca.opentrainingsale.domain.training;

import java.util.UUID;

// value object
public class TrainingId {
    private final UUID trainingId;

    public TrainingId(UUID trainingId) {
        this.trainingId = trainingId;
    }
}
