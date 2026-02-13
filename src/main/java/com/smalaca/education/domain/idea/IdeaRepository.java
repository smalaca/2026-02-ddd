package com.smalaca.education.domain.idea;

// repository
// secondary port
public interface IdeaRepository {
    void save(Idea idea);

    Idea findBy(IdeaId ideaIdVO);
}
