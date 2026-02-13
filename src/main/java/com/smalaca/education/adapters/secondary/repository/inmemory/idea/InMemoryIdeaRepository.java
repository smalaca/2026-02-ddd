package com.smalaca.education.adapters.secondary.repository.inmemory.idea;

import com.smalaca.education.domain.idea.Idea;
import com.smalaca.education.domain.idea.IdeaId;
import com.smalaca.education.domain.idea.IdeaRepository;

import java.util.Optional;

// secondary adapter
public class InMemoryIdeaRepository implements IdeaRepository {
    @Override
    public void save(Idea idea) {

    }

    @Override
    public Idea findBy(IdeaId ideaId) {
        Optional<Idea> idea = findOptionalBy(ideaId);

        if (idea.isPresent()) {
            return idea.get();
        }

        throw new IdeaNotFoundException(ideaId);
    }

    private Optional<Idea> findOptionalBy(IdeaId ideaIdVO) {
        return null;
    }
}
