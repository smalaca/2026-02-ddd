package com.smalaca.opentrainingsale.domain.offer;

import com.smalaca.opentrainingsale.application.offer.OfferId;

// repository
// secondary port
public interface OfferRepository {
    Offer findById(OfferId offerId);

    void save(Offer offer);
}
