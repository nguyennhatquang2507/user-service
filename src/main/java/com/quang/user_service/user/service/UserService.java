package com.quang.user_service.user.service;

import com.quang.user_service.user.model.dto.UserRequest;
import com.quang.user_service.user.model.dto.UserResponse;

import java.util.List;

public interface UserService {

    UserResponse createUser(UserRequest userRequest);

    List<UserResponse> getAllUser();

}
