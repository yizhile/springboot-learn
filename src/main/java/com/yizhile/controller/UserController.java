package com.yizhile.controller;

import com.yizhile.domain.User;
import com.yizhile.mapper.UserMapper;
import com.yizhile.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Integer addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @GetMapping(value = "/getUserByUsername/{user_name}")
    @ResponseBody
    public User getUserByUsername(@PathVariable("user_name")String user_name){
        return userService.getUserByUsername(user_name);
    }
}
