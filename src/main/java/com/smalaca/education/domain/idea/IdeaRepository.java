package com.smalaca.education.domain.idea;

import java.util.UUID;

// repository
// secondary port
public interface IdeaRepository {
    UUID save(Idea idea);

    Idea findBy(IdeaId ideaIdVO);
}
