package com.csdj.service;

import com.csdj.pojo.User;

import java.util.List;

/**
 * 用户业务接口
 */
public interface UserService {

    /**
     * 得到所有学生数据
     * @return 学生数据
     */
    public List<User> getUsers();
}
