package com.smalaca.education.adapters.secondary.trainerscatalogue;

import com.smalaca.education.domain.trainerscatalogue.TrainersCatalogue;
import com.smalaca.trainerscatalogue.view.TrainersCatalogueApi;

import java.util.UUID;

// secondary adapter
public class TrainersCatalogueClient implements TrainersCatalogue {
    private final TrainersCatalogueApi trainersCatalogueApi;

    public TrainersCatalogueClient(TrainersCatalogueApi trainersCatalogueApi) {
        this.trainersCatalogueApi = trainersCatalogueApi;
    }

    @Override
    public boolean isQualified(UUID authorId) {
        return trainersCatalogueApi.isQualified(authorId);
    }
}
