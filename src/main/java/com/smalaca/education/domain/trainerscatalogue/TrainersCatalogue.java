package com.smalaca.education.domain.trainerscatalogue;

import com.smalaca.education.domain.authorid.AuthorId;

// secondary port
public interface TrainersCatalogue {
    boolean isNotQualified(AuthorId authorId);
}
