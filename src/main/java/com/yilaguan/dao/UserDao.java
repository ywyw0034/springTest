package com.yilaguan.dao;

import com.yilaguan.model.UserModel;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserDao {
    List<UserModel> findAll(RowBounds rowBounds);

    UserModel findUserById(int id);

    int insertUser(UserModel userModel);

    int insertUserNew(UserModel userModel);

    int deleteUserById(int id);

    int deleteUserByName(String name);
}
