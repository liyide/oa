package com.csdj.service.impl;

import com.csdj.erpdao.mapper.UserMapper;
import com.csdj.pojo.User;
import com.csdj.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getUsers() {
        System.out.println(userMapper);
        return   userMapper.selectAll();
    }
}
