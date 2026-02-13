package com.smalaca.education.domain.idea.commands;

import com.smalaca.education.domain.authorid.AuthorId;

public record RegisterIdeaDomainCommand(AuthorId authorId, String title, String description) {
}
