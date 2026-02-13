package com.smalaca.opentrainingsale.application.training;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

public record AddTrainingCommand(
        UUID trainingDefinitionId, UUID trainerId, BigDecimal price, LocalDate startDate, LocalDate endDate) {
}
