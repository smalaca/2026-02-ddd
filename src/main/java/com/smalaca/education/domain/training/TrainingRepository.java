package com.smalaca.education.domain.training;

import com.smalaca.opentrainingsale.domain.training.TrainingId;

public interface TrainingRepository {
    Training findById(TrainingId trainingId);

    void save(Training training);
}
