package com.smalaca.opentrainingsale.domain.summary;

import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.participantid.ParticipantId;
import com.smalaca.opentrainingsale.domain.training.TrainingId;

// aggregate root
// entity
public class Summary {
    private SummaryId summaryId;
    private TrainingId trainingId;
    private ParticipantId participantId;
    private SummaryStatus status;

    // factory
    public Offer confirm() {
        status = SummaryStatus.CONFIRMED;

        return Offer.create(summaryId, trainingId, participantId);
    }
}
