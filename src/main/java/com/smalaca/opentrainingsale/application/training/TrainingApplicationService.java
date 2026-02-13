package com.smalaca.opentrainingsale.application.training;

import com.smalaca.opentrainingsale.domain.training.Training;
import com.smalaca.opentrainingsale.domain.training.TrainingDefinitionId;
import com.smalaca.opentrainingsale.domain.training.TrainingRepository;

import java.util.UUID;

// application layer
public class TrainingApplicationService {
    private final TrainingRepository trainingRepository;

    public TrainingApplicationService(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    // primary port
    public void add(UUID trainingDefinitionId) {
        TrainingDefinitionId trainingDefinitionIdVO = new TrainingDefinitionId(trainingDefinitionId);

        Training training = new Training(trainingDefinitionIdVO);

        trainingRepository.save(training);
    }
}
