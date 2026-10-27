package com.example.jobtracker.application;

import org.springframework.stereotype.Service;
import com.example.jobtracker.application.dto.CreateApplicationRequest;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class JobApplicationService {
    
    private final JobApplicationRepository repository;

    public JobApplicationService(JobApplicationRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public JobApplication createJobApplication(CreateApplicationRequest request) {
        JobApplication jobApplication = new JobApplication(
            request.companyName(),
            request.jobTitle(),
            request.applicationDate(),
            request.status()
        );
        return repository.save(jobApplication);
    }
}
