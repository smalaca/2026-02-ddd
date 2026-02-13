package com.smalaca.education.domain.idea;

import com.smalaca.education.domain.authorid.AuthorId;

import java.time.LocalDateTime;

// value object
class IdeaCode {
    private final String code;

    private IdeaCode(String code) {
        this.code = code;
    }

    // factory
    static IdeaCode from(AuthorId authorId) {
        String code = "IDEA/" + authorId.getAsString() + "/" + LocalDateTime.now();
        return new IdeaCode(code);
    }
}
