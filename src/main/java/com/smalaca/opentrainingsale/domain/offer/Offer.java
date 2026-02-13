package com.smalaca.opentrainingsale.domain.offer;

import com.smalaca.opentrainingsale.domain.participantid.ParticipantId;
import com.smalaca.opentrainingsale.domain.summary.SummaryId;
import com.smalaca.opentrainingsale.domain.training.TrainingId;

// aggregate root
// entity
public class Offer {
    private final SummaryId summaryId;
    private final TrainingId trainingId;
    private final ParticipantId participantId;

    private Offer(SummaryId summaryId, TrainingId trainingId, ParticipantId participantId) {
        this.summaryId = summaryId;
        this.trainingId = trainingId;
        this.participantId = participantId;
    }

    // factory
    public static Offer create(SummaryId summaryId, TrainingId trainingId, ParticipantId participantId) {
//        OfferCode offerCode = OfferCode.create();
        return new Offer(summaryId, trainingId, participantId);
    }

    public void cancel() {

    }

    public ParticipantId getParticipantId() {
        return participantId;
    }
}
