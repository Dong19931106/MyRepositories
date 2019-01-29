package com.bjsxt.test;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Auther:智恒
 * @Date:2019/1/22
 * @Description:com.bjsxt.test
 * @version:1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ManagerTest {
    @Autowired
    private UsersMapper usersMapper;
    @Test
    public void insertUserTest(){
        Users users=new Users();
        users.setUsername("liuyu");
        users.setPassword("520");
       usersMapper.insertUser(users);
    }
}
