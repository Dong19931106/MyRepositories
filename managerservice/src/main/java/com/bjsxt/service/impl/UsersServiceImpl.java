package com.bjsxt.service.impl;

import com.bjsxt.mapper.UsersMapper;
import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @Auther:智恒
 * @Date:2019/1/25
 * @Description:com.bjsxt.service.impl
 * @version:1.0
 */
@Service
public class UsersServiceImpl implements UsersService{
    @Autowired
    private UsersMapper usersMapper;
    @Override
    public void addUser(Users users) {
        usersMapper.insertUser(users);
    }
}
