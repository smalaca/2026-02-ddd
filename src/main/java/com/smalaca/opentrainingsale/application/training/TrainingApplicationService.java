package com.smalaca.opentrainingsale.application.training;

import com.smalaca.opentrainingsale.domain.training.*;
import com.smalaca.opentrainingsale.domain.training.commands.AddTrainingDomainCommand;

// application layer
public class TrainingApplicationService {
    private final TrainingRepository trainingRepository;

    public TrainingApplicationService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    // primary port
    public void add(AddTrainingCommand command) {
        TrainingDefinitionId trainingDefinitionId = new TrainingDefinitionId(command.trainingDefinitionId());
        TrainerId trainerId = new TrainerId(command.trainerId());
        Price price = Price.from(command.price());
        Period period = Period.from(command.startDate(), command.endDate());
        AddTrainingDomainCommand addTrainingDomainCommand = new AddTrainingDomainCommand(trainingDefinitionId, trainerId, price, period);

        Training training = new TrainingFactory().create(addTrainingDomainCommand);

        trainingRepository.save(training);
    }
}
