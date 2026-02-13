package com.smalaca.education.domain.idea;

// aggregate root
// entity
public class Idea {
    private final AuthorId authorId;

    private Idea(AuthorId authorId) {
        this.authorId = authorId;
    }

    // factory
    public static Idea create(AuthorId authorId) {
        return new Idea(authorId);
    }

    public void approve() {

    }
}
