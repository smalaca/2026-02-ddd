package com.smalaca.education.domain.idea;

import com.smalaca.education.domain.authorid.AuthorId;

class IdeaException extends RuntimeException {
    private final AuthorId authorId;

    private IdeaException(AuthorId authorId) {
        this.authorId = authorId;
    }

    public static RuntimeException notQualifiedAuthor(AuthorId authorId) {
        return new IdeaException(authorId);
    }
}
