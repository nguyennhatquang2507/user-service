package com.quang.user_service.user.service.mapper;

import com.quang.user_service.user.model.dto.UserRequest;
import com.quang.user_service.user.model.dto.UserResponse;
import com.quang.user_service.user.model.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {

    User map(UserRequest userRequest);

    UserResponse map(User user);

    List<UserResponse> map(List<User> userList);
}
