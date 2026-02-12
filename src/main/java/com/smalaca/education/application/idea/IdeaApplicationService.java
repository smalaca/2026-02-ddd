package com.smalaca.education.application.idea;

import com.smalaca.education.domain.idea.Idea;
import com.smalaca.education.domain.idea.IdeaRepository;
import jakarta.transaction.Transactional;

import java.util.UUID;

// primary port
public class IdeaApplicationService {
    private final IdeaRepository ideaRepository;

    public IdeaApplicationService(IdeaRepository ideaRepository) {
        this.ideaRepository = ideaRepository;
    }

    @Transactional
    public void register(UUID authorId) {
        // 1. tłumaczenie na język domeny - 0 - *
        AuthorId authorIdVO = AuthorId.from(authorId);

        // 2. wywołanie metody z domeny - 1
        Idea idea = new IdeaFactory().create(authorIdVO);

        // 3. zapis informacji - 1 - *
        ideaRepository.save(idea);
    }

    public void approve(UUID ideaId) {
        // 1. tłumaczenie na język domeny - 0 - *
        IdeaId ideaIdVO = IdeaId.from(ideaId);
        Idea idea = ideaRepository.findBy(ideaIdVO);

        // 2. wywołanie metody z domeny - 1
        idea.approve();

        // 3. zapis informacji - 1 - *
        ideaRepository.save(idea);
    }
}
