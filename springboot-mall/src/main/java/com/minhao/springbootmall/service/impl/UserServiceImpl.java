package com.minhao.springbootmall.service.impl;

import com.minhao.springbootmall.dao.UserDao;
import com.minhao.springbootmall.dto.UserRegisterRequest;
import com.minhao.springbootmall.model.User;
import com.minhao.springbootmall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest) {
        return userDao.createUser(userRegisterRequest);
    }
}
