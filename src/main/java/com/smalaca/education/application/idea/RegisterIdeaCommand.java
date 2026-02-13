package com.smalaca.education.application.idea;

import java.util.UUID;

public record RegisterIdeaCommand(UUID authorId, String title, String description) {
}
