package com.smalaca.opentrainingsale.adapters.primary.api.rest.cart;

import java.util.UUID;

public record AddTrainingDto(UUID cartId, UUID trainingId) {
}
