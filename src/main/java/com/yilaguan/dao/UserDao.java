package com.yilaguan.dao;

import com.yilaguan.model.UserModel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserModel> findAll();
}
