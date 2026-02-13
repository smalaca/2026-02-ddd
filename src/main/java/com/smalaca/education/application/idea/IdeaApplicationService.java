package com.smalaca.education.application.idea;

import com.smalaca.education.domain.idea.*;
import jakarta.transaction.Transactional;

import java.util.UUID;

// primary port
// application layer
public class IdeaApplicationService {
    private final IdeaRepository ideaRepository;

    public IdeaApplicationService(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Transactional
    // primary port
    public void register(UUID authorId) {
        // 1. tłumaczenie na język domeny - 0 - *
        AuthorId authorIdVO = new AuthorId(authorId);

        // 2. wywołanie metody z domeny - 1
        Idea idea = Idea.create(authorIdVO);

        // 3. zapis informacji - 1 - *
        ideaRepository.save(idea);
    }

    // primary port
    public void approve(UUID ideaId) {
        // 1. tłumaczenie na język domeny - 0 - *
        IdeaId ideaIdVO = new IdeaId(ideaId);
        Idea idea = ideaRepository.findBy(ideaIdVO);

        // 2. wywołanie metody z domeny - 1
        idea.approve();

        // 3. zapis informacji - 1 - *
        ideaRepository.save(idea);
    }
}
