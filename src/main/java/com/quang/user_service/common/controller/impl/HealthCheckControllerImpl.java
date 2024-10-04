package com.quang.user_service.common.controller.impl;

import com.quang.user_service.common.controller.HealthCheckController;
import com.quang.user_service.common.model.dto.response.CommonResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckControllerImpl implements HealthCheckController {
    @Override
    public ResponseEntity<CommonResponse> healthCheck() {
        return ResponseEntity.ok(CommonResponse.builder()
                .code(HttpStatus.OK.value())
                .message("Up")
                .data("Health Check Successfully!")
                .build());
    }
}