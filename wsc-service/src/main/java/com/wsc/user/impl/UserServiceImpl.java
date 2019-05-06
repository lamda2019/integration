package com.wsc.user.impl;


import com.wsc.dao.UserDao;
import com.wsc.pojo.User;
import com.wsc.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public List<User> list() {
        return userDao.findAll();
    }
}