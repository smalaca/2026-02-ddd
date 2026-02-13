package com.smalaca.opentrainingsale.domain.training.commands;

import com.smalaca.opentrainingsale.domain.training.Period;
import com.smalaca.opentrainingsale.domain.training.Price;
import com.smalaca.opentrainingsale.domain.training.TrainerId;
import com.smalaca.opentrainingsale.domain.training.TrainingDefinitionId;

public record AddTrainingDomainCommand(TrainingDefinitionId trainingDefinitionId, TrainerId trainerId, Price price, Period period) {
}
