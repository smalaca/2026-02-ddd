package com.smalaca.education.adapters.primary.rest.idea;

import com.smalaca.education.application.idea.IdeaApplicationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// primary adapter
@RestController("idea")
public class IdeaRestController {
    private final IdeaApplicationService ideaApplicationService;

    public IdeaRestController(IdeaApplicationService ideaApplicationService) {
        this.ideaApplicationService = ideaApplicationService;
    }

    @PostMapping("{@authorId}")
    public void register(@PathVariable UUID authorId) {
        ideaApplicationService.register(authorId);
    }
}
