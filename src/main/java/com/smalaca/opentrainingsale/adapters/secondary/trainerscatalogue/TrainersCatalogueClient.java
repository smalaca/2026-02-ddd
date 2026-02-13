package com.smalaca.opentrainingsale.adapters.secondary.trainerscatalogue;

import com.smalaca.opentrainingsale.domain.trainerscatalogue.TrainerQualification;
import com.smalaca.opentrainingsale.domain.trainerscatalogue.TrainersCatalogue;
import com.smalaca.trainerscatalogue.view.TrainersCatalogueApi;

public class TrainersCatalogueClient implements TrainersCatalogue {
    private final TrainersCatalogueApi trainersCatalogueApi;

    public TrainersCatalogueClient(TrainersCatalogueApi trainersCatalogueApi) {
        this.trainersCatalogueApi = trainersCatalogueApi;
    }

    @Override
    public boolean cannotConductTraining(TrainerQualification trainerQualification) {
        return trainersCatalogueApi.cannotConductTraining(
                trainerQualification.trainerId(), trainerQualification.trainingDefinitionId());
    }
}
