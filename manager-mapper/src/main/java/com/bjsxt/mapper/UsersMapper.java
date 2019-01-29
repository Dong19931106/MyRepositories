package com.bjsxt.mapper;

import com.bjsxt.pojo.Users;
import org.apache.ibatis.annotations.Insert;


import java.util.List;

/**
 * @Auther:智恒
 * @Date:2019/1/22
 * @Description:com.bjsxt.mapper
 * @version:1.0
 */
public interface UsersMapper {
    @Insert("insert into users values(default,#{username},#{password})")
    void insertUser(Users users);

    List<Users> selectUserAll();
}
