package com.smalaca.education.domain.idea;

// repository
public interface IdeaRepository {
    void save(Idea idea);

    Idea findBy(IdeaId ideaIdVO);
}
