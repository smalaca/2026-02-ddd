package com.smalaca.education.domain.authorid;

import java.util.UUID;

// value object
public class AuthorId {
    private final UUID authorId;

    public AuthorId(UUID authorId) {
        this.authorId = authorId;
    }

    public String getAsString() {
        return authorId.toString();
    }
}
