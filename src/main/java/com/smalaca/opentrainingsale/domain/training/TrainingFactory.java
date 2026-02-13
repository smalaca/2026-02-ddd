package com.smalaca.opentrainingsale.domain.training;

import com.smalaca.opentrainingsale.domain.training.commands.AddTrainingDomainCommand;

// factory
public class TrainingFactory {
    public Training create(AddTrainingDomainCommand command) {

        return new Training(
                command.trainingDefinitionId(),
                command.trainerId(),
                command.price(),
                command.period());
    }
}
