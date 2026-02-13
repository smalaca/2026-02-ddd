package com.smalaca.opentrainingsale.domain.training;

class TrainingException extends RuntimeException {
    private TrainingException(String message) {
        super(message);
    }

    static RuntimeException trainingDefinitionNotExist(TrainingDefinitionId trainingDefinitionId) {
        return new TrainingException("Training definition with id " + trainingDefinitionId + " does not exist");
    }

    static RuntimeException trainerCannotConductTraining(TrainerId trainerId, TrainingDefinitionId trainingDefinitionId) {
        return new TrainingException("Trainer with id " + trainerId + " cannot conduct training with definition id " + trainingDefinitionId);
    }
}
