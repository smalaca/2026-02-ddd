package com.smalaca.trainerscatalogue.view;

import com.smalaca.opentrainingsale.domain.training.TrainerId;
import com.smalaca.opentrainingsale.domain.training.TrainingDefinitionId;

import java.util.UUID;

public class TrainersCatalogueApi {
    public boolean isQualified(UUID trainerId) {
        return false;
    }

    public boolean cannotConductTraining(TrainerId trainerId, TrainingDefinitionId trainingDefinitionId) {
        return false;
    }
}
