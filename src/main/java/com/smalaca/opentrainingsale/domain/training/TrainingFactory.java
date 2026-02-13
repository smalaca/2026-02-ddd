package com.smalaca.opentrainingsale.domain.training;

import com.smalaca.opentrainingsale.domain.education.Education;
import com.smalaca.opentrainingsale.domain.trainerscatalogue.TrainerQualification;
import com.smalaca.opentrainingsale.domain.trainerscatalogue.TrainersCatalogue;
import com.smalaca.opentrainingsale.domain.training.commands.AddTrainingDomainCommand;

// factory
public class TrainingFactory {
    private final Education education;
    private final TrainersCatalogue trainersCatalogue;

    public TrainingFactory(Education education, TrainersCatalogue trainersCatalogue) {
        this.education = education;
        this.trainersCatalogue = trainersCatalogue;
    }

    public Training create(AddTrainingDomainCommand command) {
        if (education.doesNotExist(command.trainingDefinitionId())) {
            throw TrainingException.trainingDefinitionNotExist(command.trainingDefinitionId());
        }

        if (trainersCatalogue.cannotConductTraining(new TrainerQualification(command.trainerId(), command.trainingDefinitionId()))) {
            throw TrainingException.trainerCannotConductTraining(command.trainerId(), command.trainingDefinitionId());
        }

        return new Training(
                command.trainingDefinitionId(),
                command.trainerId(),
                command.price(),
                command.period());
    }
}
