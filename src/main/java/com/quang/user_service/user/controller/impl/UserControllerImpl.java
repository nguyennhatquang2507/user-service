package com.quang.user_service.user.controller.impl;

import com.quang.user_service.common.model.dto.response.CommonResponseGeneric;
import com.quang.user_service.user.controller.UserController;
import com.quang.user_service.user.model.dto.UserRequest;
import com.quang.user_service.user.model.dto.UserResponse;
import com.quang.user_service.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserControllerImpl implements UserController {

    @Autowired
    UserService userService;

    @Override
    public CommonResponseGeneric<UserResponse> createUser(@RequestBody UserRequest userRequest) {
        System.out.println(userRequest);
        UserResponse userResponse = userService.createUser(userRequest);
        return CommonResponseGeneric.<UserResponse>builder()
                .data(userResponse)
                .message("Success")
                .code(200)
                .build();
    }

    @Override
    public CommonResponseGeneric<List<UserResponse>> createUser() {
        return CommonResponseGeneric.<List<UserResponse>>builder()
                .data(userService.getAllUser())
                .message("Success")
                .code(200)
                .build();
    }
}
