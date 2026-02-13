package com.smalaca.opentrainingsale.domain.training;

import java.util.UUID;

// value object
public class TrainerId {
    private final UUID trainerId;

    public TrainerId(UUID trainerId) {
        this.trainerId = trainerId;
    }
}
