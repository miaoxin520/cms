package com.ibeifeng.springmvc.controller;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/2/20.
 */
@Controller
public class UserController  {
    @RequestMapping(name = "/user.do")
    public String add() {
        System.out.println("add..");

        return null;
    }
}
