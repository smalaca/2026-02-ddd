package com.smalaca.opentrainingsale.domain.training;

import com.smalaca.opentrainingsale.domain.participantid.ParticipantId;

import java.util.ArrayList;
import java.util.List;

// aggregate root
// entity
public class Training {
    private final TrainingDefinitionId trainingDefinitionId;
    private final TrainerId trainerId;
    private final Price price;
    private final Period period;
    private final List<ParticipantId> participants = new ArrayList<>();

    Training(TrainingDefinitionId trainingDefinitionId, TrainerId trainerId, Price price, Period period) {
        this.trainingDefinitionId = trainingDefinitionId;
        this.trainerId = trainerId;
        this.price = price;
        this.period = period;
    }

    public void bookPlace(ParticipantId participantId) {
        participants.add(participantId);
    }
}
