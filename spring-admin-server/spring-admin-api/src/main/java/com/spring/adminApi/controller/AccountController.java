package com.spring.adminApi.controller;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.service.system.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@RestController
@RequestMapping(value = "/account")
public class AccountController {
    Logger logger = LoggerFactory.getLogger(AccountController.class);

    @Autowired
    UserService userService;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public List<User> login() {

        List<User> users = userService.selectList();
        logger.info("登录接口");
        return users;

    }
}
