package com.smalaca.opentrainingsale.domain.training;

import java.time.LocalDate;

class PeriodException extends RuntimeException {
    private LocalDate startDate;
    private LocalDate endDate;

    public static RuntimeException startDateFromPast(LocalDate startDate) {
        PeriodException periodException = new PeriodException();
        periodException.startDate = startDate;
        return periodException;
    }

    public static RuntimeException endDateBeforeStartDate(LocalDate startDate, LocalDate endDate) {
        PeriodException periodException = new PeriodException();
        periodException.startDate = startDate;
        periodException.endDate = endDate;
        return periodException;
    }
}
