package com.smalaca.education.domain.idea;

import com.smalaca.education.domain.idea.commands.RegisterIdeaDomainCommand;
import com.smalaca.education.domain.trainerscatalogue.TrainersCatalogue;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

// factory
public class IdeaFactory {
    private final TrainersCatalogue trainersCatalogue;

    public IdeaFactory(TrainersCatalogue trainersCatalogue) {
        this.trainersCatalogue = trainersCatalogue;
    }

    public Idea create(RegisterIdeaDomainCommand command) {
        if (trainersCatalogue.isNotQualified(command.authorId())) {
            throw IdeaException.notQualifiedAuthor(command.authorId());
        }

        IdeaCode ideaCode = IdeaCode.from(command.authorId());
        IdeaId ideaId = IdeaId.createNew();
        return new Idea(ideaCode, ideaId, command.authorId(), command.title(), command.description());
    }
}
