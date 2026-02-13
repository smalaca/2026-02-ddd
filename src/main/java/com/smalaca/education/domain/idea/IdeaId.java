package com.smalaca.education.domain.idea;

import java.util.UUID;

// value object
public class IdeaId {
    private final UUID ideaId;

    public IdeaId(UUID ideaId) {
        this.ideaId = ideaId;
    }
}
