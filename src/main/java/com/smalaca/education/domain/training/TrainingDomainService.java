package com.smalaca.education.domain.training;

// domain service
public class TrainingDomainService {

    public void change(Training trainingFrom, Training trainingTo) {
        TrainerId trainerIdFrom = trainingFrom.getTrainer();
        TrainerId trainerIdTo = trainingTo.getTrainer();
        trainingFrom.changeTrainer(trainerIdTo);
        trainingTo.changeTrainer(trainerIdFrom);
    }

}
