package com.smalaca.opentrainingsale.adapters.primary.api.rest.offer;

import com.smalaca.opentrainingsale.application.offer.OfferApplicationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("offer")
public class OfferRestController {
    private final OfferApplicationService offerApplicationService;

    public OfferRestController(OfferApplicationService offerApplicationService) {
        this.offerApplicationService = offerApplicationService;
    }

    @PostMapping("{$offerId}")
    public void cancel(@PathVariable UUID offerId) {
        offerApplicationService.cancel(offerId);
    }
}
