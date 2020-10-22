package com.yilaguan.service.impl;

import com.yilaguan.dao.UserDao;
import com.yilaguan.model.UserModel;
import com.yilaguan.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserImpl implements UserService {

    @Resource
    private UserDao userDao;
    @Override
    public List<UserModel> findAll() {
        return userDao.findAll();
    }

    @Override
    public UserModel findUserById(int id) {
        return userDao.findUserById(id);
    }

    @Override
    public int insertUser(UserModel userModel) {
        return userDao.insertUser(userModel);
    }
}
