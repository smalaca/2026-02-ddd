package com.smalaca.opentrainingsale.domain.education;

import com.smalaca.opentrainingsale.domain.training.TrainingDefinitionId;

public interface Education {
    boolean doesNotExist(TrainingDefinitionId trainingDefinitionId);
}
