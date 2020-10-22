package com.yilaguan;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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
        PageHelper.startPage(2,2);
        List<UserModel> userModelList=userDao.findAll();
        PageInfo pageInfo=new PageInfo(userModelList);
        System.out.println(userModelList.size());
    }
}
