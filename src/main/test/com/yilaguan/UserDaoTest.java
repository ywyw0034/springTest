package com.yilaguan;

import com.yilaguan.dao.UserDao;
import com.yilaguan.model.UserModel;
import org.apache.ibatis.session.RowBounds;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserDaoTest {

    @Resource
    private UserDao userDao;

    @Test
    public void testFindAll(){
        List<UserModel> userModelList=userDao.findAll(new RowBounds(1,2));
        System.out.println(userModelList.size());
    }
}
