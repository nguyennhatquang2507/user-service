package com.quang.user_service.user.controller;

import com.quang.user_service.common.model.dto.response.CommonResponseGeneric;
import com.quang.user_service.user.model.dto.UserRequest;
import com.quang.user_service.user.model.dto.UserResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RequestMapping("user")
public interface UserController {

    @PostMapping("create")
    CommonResponseGeneric<UserResponse> createUser(UserRequest userRequest);

    @GetMapping("get-all")
    CommonResponseGeneric<List<UserResponse>> createUser();
}
