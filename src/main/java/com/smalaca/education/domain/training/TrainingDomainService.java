package com.smalaca.education.domain.training;

import java.util.List;

import static java.util.Arrays.asList;

// domain service
public class TrainingDomainService {

    public List<Training> change(Training trainingFrom, Training trainingTo) {
        TrainerId trainerIdFrom = trainingFrom.getTrainer();
        TrainerId trainerIdTo = trainingTo.getTrainer();
        trainingFrom.changeTrainer(trainerIdTo);
        trainingTo.changeTrainer(trainerIdFrom);

        return asList(trainingFrom, trainingTo);
    }

}
