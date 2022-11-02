package com.spring.adminApi;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.service.system.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

/**
 * Created on 2022/11/2
 *
 * @author huangwx
 * Description:
 */
@SpringBootTest
public class adminApiTest {

    @Autowired
    UserService userService;


    @Test
    public void list(){
        List<User> list = userService.list();
        System.out.println(list);
    }
}
