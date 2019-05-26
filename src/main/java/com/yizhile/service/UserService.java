package com.yizhile.service;

import com.yizhile.domain.User;

public interface UserService {
    public abstract Integer addUser(User user);
    public abstract User getUserByUsername(String user_name);
}
