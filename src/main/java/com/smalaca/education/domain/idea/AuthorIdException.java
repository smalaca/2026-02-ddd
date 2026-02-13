package com.smalaca.education.domain.idea;

import java.util.UUID;

class AuthorIdException extends RuntimeException {
    private final UUID authorId;

    AuthorIdException(UUID authorId) {
        this.authorId = authorId;
    }
}
