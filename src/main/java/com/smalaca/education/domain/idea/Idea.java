package com.smalaca.education.domain.idea;

// aggregate root
// entity
public class Idea {
    // id techniczny
    private IdeaId ideaId;
    // id biznesowy
    private final IdeaCode ideaCode;
    private final AuthorId authorId;

    private Idea(IdeaCode ideaCode, AuthorId authorId) {
        this.ideaCode = ideaCode;
        this.authorId = authorId;
    }

    // factory
    public static Idea create(AuthorId authorId) {
        IdeaCode ideaCode = IdeaCode.from(authorId);
        return new Idea(ideaCode, authorId);
    }

    public IdeaId getId() {
        return ideaId;
    }

    public void approve() {

    }
}
