package com.smalaca.opentrainingsale.application.offer;

import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.offer.OfferRepository;

import java.util.UUID;

// application layer
public class OfferApplicationService {
    private final OfferRepository offerRepository;

    public OfferApplicationService(OfferRepository offerRepository) {
        this.offerRepository = offerRepository;
    }

    // primary port
    public void cancel(UUID offerId) {
        OfferId offerIdVO = new OfferId(offerId);
        Offer offer = offerRepository.findById(offerIdVO);

        offer.cancel();

        offerRepository.save(offer);
    }
}
