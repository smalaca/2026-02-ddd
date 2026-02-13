package com.smalaca.education.domain.idea;

// aggregate root
// entity
public class Idea {
    // id techniczny
    private IdeaId ideaId;
    // id biznesowy
    private final IdeaCode ideaCode;
    private final AuthorId authorId;

    private Idea(IdeaCode ideaCode, IdeaId ideaId, AuthorId authorId) {
        this.ideaCode = ideaCode;
        this.ideaId = ideaId;
        this.authorId = authorId;
    }

    // factory
    public static Idea create(AuthorId authorId) {
        IdeaCode ideaCode = IdeaCode.from(authorId);
        IdeaId ideaId = IdeaId.createNew();
        return new Idea(ideaCode, ideaId, authorId);
    }

    public void approve() {

    }
}
