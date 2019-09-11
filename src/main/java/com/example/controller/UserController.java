package com.example.controller;

import com.example.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/12/20.
 */
@Controller
public class UserController {
    @Autowired
    private User user;
    @RequestMapping("/testValue")
    @ResponseBody
    public String testValue(){
        return user.toString();
    }
}
