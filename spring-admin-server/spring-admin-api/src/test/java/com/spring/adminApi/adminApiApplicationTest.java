package com.spring.adminApi;

import com.spring.adminApi.bean.entity.system.User;
import com.spring.adminApi.dao.system.UserRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class adminApiApplicationTest {


    @Autowired
    UserRepository userRepository;

    @Test
    public void test() {


        User user1 = new User();
        user1.setUserName("admin");
        user1.setPassWord("admin");


        int insert = userRepository.insert(user1);


        System.out.println("测试");
    }
}
