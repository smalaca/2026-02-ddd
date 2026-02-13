package com.smalaca.opentrainingsale.domain.trainerscatalogue;

import com.smalaca.opentrainingsale.domain.training.TrainerId;
import com.smalaca.opentrainingsale.domain.training.TrainingDefinitionId;

public record TrainerQualification(TrainerId trainerId, TrainingDefinitionId trainingDefinitionId) {
}
