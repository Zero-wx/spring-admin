package com.spring.adminApi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.spring.adminApi.dao")
public class adminApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(adminApiApplication.class,args);
    }
}
