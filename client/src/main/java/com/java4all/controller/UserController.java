package com.java4all.controller;

import api.UserApi;
import com.alibaba.dubbo.config.annotation.Reference;
import com.java4all.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: momo
 * Date: 2018/6/9
 * Description:
 */
@RestController
@RequestMapping(value = "user")
public class UserController {

    //指定服务实现类以及版本
    @Reference(version = "1.0.0")
    private UserApi userApi;

    @RequestMapping(value = "getUserById",method = RequestMethod.GET)
    public User getUserById(Integer id){
        //调用服务提供的方法
        return userApi.getUserById(88);
    }

}

