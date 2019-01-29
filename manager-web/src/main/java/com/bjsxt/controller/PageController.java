package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther:智恒
 * @Date:2019/1/25
 * @Description:com.bjsxt.controller
 * @version:1.0
 */
@Controller
public class PageController {
    @RequestMapping("/{page}")
    public String showPage(@PathVariable String page){
        return page;
    }
}
