package com.smalaca.education.adapters.primary.rest.idea;

import com.smalaca.education.application.idea.IdeaApplicationService;
import com.smalaca.education.application.idea.RegisterIdeaCommand;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

// primary adapter
@RestController("idea")
public class IdeaRestController {
    private final IdeaApplicationService ideaApplicationService;

    public IdeaRestController(IdeaApplicationService ideaApplicationService) {
        this.ideaApplicationService = ideaApplicationService;
    }

    // OPTION 1
//    @PostMapping("{@authorId}")
//    public void register(@PathVariable UUID authorId) {
//        UUID ideaId = UUID.randomUUID();
//        ideaApplicationService.register(authorId, ideaId);
//        return ideaId;
//    }

    // OPTION 2
    @PostMapping
    public UUID register(@RequestBody IdeaDto dto) {
        renewSession(dto.sessionId());

        return ideaApplicationService.register(dto.asCommand());
    }

    private void renewSession(UUID sessionId) {
        // ...
    }
}
