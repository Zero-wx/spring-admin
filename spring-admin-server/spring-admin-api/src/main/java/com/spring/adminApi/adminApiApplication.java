package com.spring.adminApi;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.adminApi.dao")
public class adminApiApplication {

    private static final Logger logger = LoggerFactory.getLogger(adminApiApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(adminApiApplication.class, args);
        logger.info("springAdminApi 启动成功");
    }

}
