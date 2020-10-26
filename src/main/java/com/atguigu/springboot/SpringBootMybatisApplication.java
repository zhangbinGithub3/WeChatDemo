package com.atguigu.springboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan
@SpringBootApplication
public class SpringBootMybatisApplication {

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(SpringBootMybatisApplication.class, args);
    }

}
