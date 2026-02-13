package com.smalaca.education.domain.idea;

import java.util.UUID;

// factory
public class AuthorIdFactory {
    private final TrainersCatalogue trainersCatalogue;

    public AuthorIdFactory(TrainersCatalogue trainersCatalogue) {
        this.trainersCatalogue = trainersCatalogue;
    }

    public AuthorId create(UUID authorId) {
        if (trainersCatalogue.isQualified(authorId)) {
            return new AuthorId(authorId);
        }

        throw new AuthorIdException(authorId);
    }
}
