package com.smalaca.education.domain.idea;

import java.util.UUID;

// value object
public class AuthorId {
    private final UUID authorId;

    public AuthorId(UUID authorId) {
        this.authorId = authorId;
    }
}
