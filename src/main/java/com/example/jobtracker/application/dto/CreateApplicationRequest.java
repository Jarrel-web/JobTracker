package com.example.jobtracker.application.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import com.example.jobtracker.application.ApplicationStatus;
public record CreateApplicationRequest(
    @NotBlank(message = "Company name is required") String companyName,
    @NotBlank(message = "Job title is required") String jobTitle,
    @NotNull(message = "Application date is required") LocalDate applicationDate,
    @NotNull(message = "Status is required") ApplicationStatus status
) {}
