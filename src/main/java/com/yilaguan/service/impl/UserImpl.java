package com.yilaguan.service.impl;

import com.yilaguan.dao.UserDao;
import com.yilaguan.model.UserModel;
import com.yilaguan.service.UserService;
import org.apache.ibatis.session.RowBounds;
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

    @Override
    public int insertUserNew(UserModel userModel) {
        return userDao.insertUserNew(userModel);
    }

    @Override
    public int deleteUserById(int id) {
        return userDao.deleteUserById(id);
    }

    @Override
    public int deleteUserByName(String name) {
        return userDao.deleteUserByName(name);
    }
}
