package com.smalaca.opentrainingsale.domain.training;

import java.time.LocalDate;

// value object
public class Period {
    private final LocalDate startDate;
    private final LocalDate endDate;

    private Period(LocalDate startDate, LocalDate endDate) {
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // factory
    public static Period from(LocalDate startDate, LocalDate endDate) {
        return new Period(startDate, endDate);
    }
}
