package com.csdj.controller;

import com.csdj.pojo.User;
import com.csdj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;
    /**
     * 显示用户信息
     * @return
     */
    @GetMapping("showUser")
    public List<User> showUser(){
        return  userService.getUsers();
    }
}
