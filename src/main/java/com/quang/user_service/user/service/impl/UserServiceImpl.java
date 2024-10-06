package com.quang.user_service.user.service.impl;

import com.quang.user_service.user.model.dto.UserRequest;
import com.quang.user_service.user.model.dto.UserResponse;
import com.quang.user_service.user.model.entity.User;
import com.quang.user_service.user.repository.UserRepository;
import com.quang.user_service.user.service.UserService;
import com.quang.user_service.user.service.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserResponse createUser(UserRequest userRequest) {
        User user = userMapper.map(userRequest);
        user = userRepository.save(user);
        return userMapper.map(user);
    }

    @Override
    public List<UserResponse> getAllUser() {
        List<User> userList = userRepository.findAll();
        return userMapper.map(userList);
    }
}
