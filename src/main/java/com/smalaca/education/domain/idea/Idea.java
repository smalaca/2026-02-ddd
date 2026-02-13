package com.smalaca.education.domain.idea;

import com.smalaca.education.domain.authorid.AuthorId;
import com.smalaca.education.domain.idea.commands.RegisterIdeaDomainCommand;

// aggregate root
// entity
public class Idea {
    // id techniczny
    private IdeaId ideaId;
    // id biznesowy
    private final IdeaCode ideaCode;
    private final AuthorId authorId;

    private final String title;
    private final String description;

    private Idea(IdeaCode ideaCode, IdeaId ideaId, AuthorId authorId, String title, String description) {
        this.ideaCode = ideaCode;
        this.ideaId = ideaId;
        this.authorId = authorId;
        this.title = title;
        this.description = description;
    }

    // factory
    public static Idea create(RegisterIdeaDomainCommand command) {
        IdeaCode ideaCode = IdeaCode.from(command.authorId());
        IdeaId ideaId = IdeaId.createNew();
        return new Idea(ideaCode, ideaId, command.authorId(), command.title(), command.description());
    }

    public void approve() {

    }
}
