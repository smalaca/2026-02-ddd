package com.smalaca.opentrainingsale.domain.training;

// aggregate root
// entity
public class Training {
    private final TrainingDefinitionId trainingDefinitionId;
    private final TrainerId trainerId;
    private final Price price;
    private final Period period;

    Training(TrainingDefinitionId trainingDefinitionId, TrainerId trainerId, Price price, Period period) {
        this.trainingDefinitionId = trainingDefinitionId;
        this.trainerId = trainerId;
        this.price = price;
        this.period = period;
    }
}
