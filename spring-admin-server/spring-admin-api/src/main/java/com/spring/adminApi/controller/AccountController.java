package com.spring.adminApi.controller;

import com.spring.adminApi.bean.entity.system.SysUser;
import com.spring.adminApi.service.system.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2022/11/1
 *
 * @author huangwx
 * Description:
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    UserServiceImpl userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public List<SysUser> login() {


        List<SysUser> list = userService.list();
        return list;
    }
}
