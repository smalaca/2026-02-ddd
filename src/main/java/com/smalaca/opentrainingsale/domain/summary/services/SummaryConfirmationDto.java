package com.smalaca.opentrainingsale.domain.summary.services;

import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.summary.Summary;
import com.smalaca.opentrainingsale.domain.training.Training;

public record SummaryConfirmationDto(Summary summary, Training training, Offer offer) {
}
