package com.yilaguan.service;

import com.yilaguan.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserModel> findAll();

    UserModel findUserById(int id);

    int insertUser(UserModel userModel);

    int insertUserNew(UserModel userModel);

    int deleteUserById(int id);

    int deleteUserByName(String name);
}
