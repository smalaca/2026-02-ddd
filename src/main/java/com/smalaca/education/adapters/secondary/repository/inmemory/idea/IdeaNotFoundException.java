package com.smalaca.education.adapters.secondary.repository.inmemory.idea;

import com.smalaca.education.domain.idea.IdeaId;

class IdeaNotFoundException extends RuntimeException {
    private final IdeaId ideaId;

    IdeaNotFoundException(IdeaId ideaId) {
        this.ideaId = ideaId;
    }
}
