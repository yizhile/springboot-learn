package com.yizhile.service.impl;

import com.yizhile.domain.User;
import com.yizhile.mapper.UserMapper;
import com.yizhile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public Integer addUser(User user) {
        return userMapper.insertUser(user);
    }

    @Override
    public User getUserByUsername(String user_name) {
        return userMapper.selectUserByUsername(user_name);
    }
}
