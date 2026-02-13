package com.smalaca.opentrainingsale.application.summary;

import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.offer.OfferRepository;
import com.smalaca.opentrainingsale.domain.summary.Summary;
import com.smalaca.opentrainingsale.domain.summary.SummaryId;
import com.smalaca.opentrainingsale.domain.summary.SummaryRepository;
import com.smalaca.opentrainingsale.domain.summary.services.ConfirmSummaryDomainService;
import com.smalaca.opentrainingsale.domain.summary.services.SummaryConfirmationDto;
import com.smalaca.opentrainingsale.domain.training.Training;
import com.smalaca.opentrainingsale.domain.training.TrainingId;
import com.smalaca.opentrainingsale.domain.training.TrainingRepository;

import java.util.UUID;

public class SummaryApplicationService {
    private final SummaryRepository summaryRepository;
    private final TrainingRepository trainingRepository;
    private final OfferRepository offerRepository;
    private final ConfirmSummaryDomainService confirmSummaryDomainService;

    public SummaryApplicationService(SummaryRepository summaryRepository, TrainingRepository trainingRepository, OfferRepository offerRepository, ConfirmSummaryDomainService confirmSummaryDomainService) {
        this.summaryRepository = summaryRepository;
        this.trainingRepository = trainingRepository;
        this.offerRepository = offerRepository;
        this.confirmSummaryDomainService = confirmSummaryDomainService;
    }

    public void confirm(UUID summaryId, UUID trainingId) {
        SummaryId summaryIdVO = new SummaryId(summaryId);
        TrainingId trainingIdVO = new TrainingId(trainingId);
        Summary summary = summaryRepository.findById(summaryIdVO);
        Training training = trainingRepository.findById(trainingIdVO);

        SummaryConfirmationDto dto = confirmSummaryDomainService.confirm(summary, training);

        trainingRepository.save(dto.training());
        summaryRepository.save(dto.summary());
        offerRepository.save(dto.offer());
    }
}
