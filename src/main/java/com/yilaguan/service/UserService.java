package com.yilaguan.service;

import com.yilaguan.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {
    List<UserModel> findAll();
}
