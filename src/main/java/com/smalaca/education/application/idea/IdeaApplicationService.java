package com.smalaca.education.application.idea;

import com.smalaca.education.domain.authorid.AuthorId;
import com.smalaca.education.domain.idea.*;
import com.smalaca.education.domain.idea.commands.RegisterIdeaDomainCommand;
import jakarta.transaction.Transactional;

import java.util.UUID;

// primary port
// application layer
public class IdeaApplicationService {
    private final IdeaRepository ideaRepository;
    private final IdeaFactory ideaFactory;

    public IdeaApplicationService(IdeaRepository ideaRepository, IdeaFactory ideaFactory) {
        this.ideaRepository = ideaRepository;
        this.ideaFactory = ideaFactory;
    }

    @Transactional
    // primary port
    public UUID register(RegisterIdeaCommand command) {
        // 1. tłumaczenie na język domeny - 0 - *
        AuthorId authorId = new AuthorId(command.authorId());
        RegisterIdeaDomainCommand domainCommand = new RegisterIdeaDomainCommand(authorId, command.title(), command.description());

        // 2. wywołanie metody z domeny - 1
        Idea idea = ideaFactory.create(domainCommand);

        // 3. zapis informacji - 1 - *
        return ideaRepository.save(idea);
        // OPTION 3
//        return idea.getId();
    }

    // primary port
    public void approve(UUID ideaId) {
        // 1. tłumaczenie na język domeny - 0 - *
        IdeaId ideaIdVO = IdeaId.existing(ideaId);
        Idea idea = ideaRepository.findBy(ideaIdVO);

        // 2. wywołanie metody z domeny - 1
        idea.approve();

        // 3. zapis informacji - 1 - *
        ideaRepository.save(idea);
    }
}
