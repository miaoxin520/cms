package com.ibeifeng.springmvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/20.
 */
public class LoginController {
    @RequestMapping("/login")
    public String login(String username, Model model){
        System.out.println(username);
        model.addAttribute()
    }
}
