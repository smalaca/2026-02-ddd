package com.smalaca.education.application.training;


import com.smalaca.education.domain.training.TrainerId;
import com.smalaca.education.domain.training.Training;
import com.smalaca.education.domain.training.TrainingDomainService;
import com.smalaca.education.domain.training.TrainingRepository;
import com.smalaca.opentrainingsale.domain.training.TrainingId;
import jakarta.transaction.Transactional;

import java.util.List;
import java.util.UUID;

public class TrainingApplicationService {
    private final TrainingRepository trainingRepository;
    private final TrainingDomainService trainingDomainService;

    public TrainingApplicationService(TrainingRepository trainingRepository, TrainingDomainService trainingDomainService) {
        this.trainingRepository = trainingRepository;
        this.trainingDomainService = trainingDomainService;
    }

    @Transactional
    public void change(UUID fromTrainingId, UUID toTrainingId) {
        TrainingId trainingIdFrom = new TrainingId(fromTrainingId);
        TrainingId trainingIdTo = new TrainingId(toTrainingId);
        Training trainingFrom = trainingRepository.findById(trainingIdFrom);
        Training trainingTo = trainingRepository.findById(trainingIdTo);

        List<Training> trainings = trainingDomainService.change(trainingFrom, trainingTo);

        trainings.forEach(trainingRepository::save);
    }
}
