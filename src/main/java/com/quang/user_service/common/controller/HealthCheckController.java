package com.quang.user_service.common.controller;

import com.quang.user_service.common.model.dto.response.CommonResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/health-check")
public interface HealthCheckController {

    @GetMapping()
    ResponseEntity<CommonResponse> healthCheck();

}