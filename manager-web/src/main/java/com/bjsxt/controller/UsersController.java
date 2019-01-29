package com.bjsxt.controller;

import com.bjsxt.pojo.Users;
import com.bjsxt.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * @Auther:智恒
 * @Date:2019/1/25
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
@RequestMapping("/user")
public class UsersController {
    @Autowired
    private UsersService usersService;
    @RequestMapping("/addUser")
    public String addUser(Users users){
        usersService.addUser(users);
        System.out.println(users.getUsername());
        return "/ok.jsp";
    }
}
