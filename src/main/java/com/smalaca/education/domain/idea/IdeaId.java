package com.smalaca.education.domain.idea;

import java.util.UUID;

// value object
public class IdeaId {
    private final UUID ideaId;

    private IdeaId(UUID ideaId) {
        this.ideaId = ideaId;
    }

    // factory
    public static IdeaId createNew() {
        return new IdeaId(UUID.randomUUID());
    }

    // factory
    public static IdeaId existing(UUID ideaId) {
        return new IdeaId(ideaId);
    }
}
