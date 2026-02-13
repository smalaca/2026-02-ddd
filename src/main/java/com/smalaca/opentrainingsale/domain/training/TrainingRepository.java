package com.smalaca.opentrainingsale.domain.training;

// repository
// secondary port
public interface TrainingRepository {
    void save(Training training);

    Training findById(TrainingId trainingId);
}
