package com.smalaca.education.adapters.primary.rest.idea;

import com.smalaca.education.application.idea.RegisterIdeaCommand;

import java.util.UUID;

public record IdeaDto(UUID sessionId, UUID authorId, String title, String description) {
    public RegisterIdeaCommand asCommand() {
        return new RegisterIdeaCommand(authorId, title, description);
    }
}
