package com.smalaca.education.domain.idea;

import com.smalaca.education.domain.authorid.AuthorId;
import com.smalaca.education.domain.idea.commands.RegisterIdeaDomainCommand;
import com.smalaca.education.domain.trainerscatalogue.TrainersCatalogue;

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

    Idea(IdeaCode ideaCode, IdeaId ideaId, AuthorId authorId, String title, String description) {
        this.ideaCode = ideaCode;
        this.ideaId = ideaId;
        this.authorId = authorId;
        this.title = title;
        this.description = description;
    }

    public void approve() {

    }
}
