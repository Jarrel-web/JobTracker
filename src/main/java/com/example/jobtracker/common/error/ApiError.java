package com.example.jobtracker.common.error;
import java.util.Map;
public record ApiError(String message, Map<String, String> fieldErrors) {
        
}
