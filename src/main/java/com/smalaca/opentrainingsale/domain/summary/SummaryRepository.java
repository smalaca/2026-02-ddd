package com.smalaca.opentrainingsale.domain.summary;

// repository
// secondary port
public interface SummaryRepository {
    Summary findById(SummaryId summaryId);

    void save(Summary summary);
}
