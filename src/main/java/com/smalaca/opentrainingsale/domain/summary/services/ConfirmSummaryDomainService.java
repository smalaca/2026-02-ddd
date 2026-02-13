package com.smalaca.opentrainingsale.domain.summary.services;

import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.summary.Summary;
import com.smalaca.opentrainingsale.domain.training.Training;

public class ConfirmSummaryDomainService {
    public SummaryConfirmationDto confirm(Summary summary, Training training) {
        Offer offer = summary.confirm();
        training.bookPlace(offer.getParticipantId());

        return new SummaryConfirmationDto(summary, training, offer);
    }
}
