package com.example.jobtracker.application;
import com.example.jobtracker.application.dto.CreateApplicationRequest;
import com.example.jobtracker.application.dto.CreateApplicationResponse;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
public class JobApplicationController {
    private final JobApplicationService service;

    public JobApplicationController(JobApplicationService service) {
        this.service = service;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CreateApplicationResponse createJobApplication(@Valid @RequestBody CreateApplicationRequest request) {
        JobApplication jobApplication = service.createJobApplication(request);
        return new CreateApplicationResponse(jobApplication.getId(), "Job application recorded successfully");
    }
}
