package com.smalaca.opentrainingsale.adapters.primary.api.rest.training;

import com.smalaca.opentrainingsale.application.training.AddTrainingCommand;
import com.smalaca.opentrainingsale.application.training.TrainingApplicationService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController("training")
public class TrainingRestController {
    private final TrainingApplicationService trainingApplicationService;

    public TrainingRestController(TrainingApplicationService trainingApplicationService) {
        this.trainingApplicationService = trainingApplicationService;
    }

    @PostMapping
    public void add(@RequestBody AddTrainingCommand command) {
        trainingApplicationService.add(command);
    }
}
