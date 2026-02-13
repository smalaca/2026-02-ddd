package com.smalaca.education.application.idea;

import com.smalaca.education.domain.idea.*;
import com.smalaca.education.domain.idea.commands.RegisterIdeaDomainCommand;
import jakarta.transaction.Transactional;

import java.util.UUID;

// primary port
// application layer
public class IdeaApplicationService {
    private final IdeaRepository ideaRepository;
    private final AuthorIdFactory authorIdFactory;

    public IdeaApplicationService(IdeaRepository ideaRepository, AuthorIdFactory authorIdFactory) {
        this.ideaRepository = ideaRepository;
        this.authorIdFactory = authorIdFactory;
    }

    @Transactional
    // primary port
    public UUID register(RegisterIdeaCommand command) {
        // 1. tłumaczenie na język domeny - 0 - *
        AuthorId authorId = authorIdFactory.create(command.authorId());
        RegisterIdeaDomainCommand domainCommand = new RegisterIdeaDomainCommand(authorId, command.title(), command.description());

        // 2. wywołanie metody z domeny - 1
        Idea idea = Idea.create(domainCommand);

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
