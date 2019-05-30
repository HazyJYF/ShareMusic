package com.share.ShareMusic.controller;


import com.share.ShareMusic.dao.model.UserTest;
import com.share.ShareMusic.service.UserTestService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class TestController {

    @Autowired
    private UserTestService userTestService;

    @RequestMapping(value = "/index" , method = RequestMethod.GET)
    @ResponseBody
    public String Test(){
        return new Date().getDay() +" ms";
    }

    @RequestMapping(value = "/index/find" , method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "测试查找用户")
    public UserTest findUserById(){
        return userTestService.getUserById(1);
    }

}
