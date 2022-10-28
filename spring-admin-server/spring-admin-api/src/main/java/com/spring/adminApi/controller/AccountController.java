package com.spring.adminApi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/account")
@RestController
public class AccountController {

    private static Logger logger = LoggerFactory.getLogger(AccountController.class);

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public void login() {
        logger.info("测试");
    }
}
