package com.smalaca.opentrainingsale.adapters.secondary.repository.inmemory.offer;

import com.smalaca.opentrainingsale.application.offer.OfferId;
import com.smalaca.opentrainingsale.domain.offer.Offer;
import com.smalaca.opentrainingsale.domain.offer.OfferRepository;

// secondary adapter
public class InMemoryOfferRepository implements OfferRepository {
    @Override
    public Offer findById(OfferId offerId) {
        return null;
    }

    @Override
    public void save(Offer offer) {

    }
}
