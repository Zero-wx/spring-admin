package com.spring.adminApi;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.service.system.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class adminApiApplicationTest {

    @Autowired
    UserService userService;

    @Test
    public void add() {

        User user = new User();
        user.setUserName("测试");


        boolean save = userService.save(user);


    }

}
