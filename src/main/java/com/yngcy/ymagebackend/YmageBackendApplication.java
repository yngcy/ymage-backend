package com.yngcy.ymagebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.yngcy.ymagebackend.mapper")
@EnableAspectJAutoProxy(exposeProxy = true)
public class YmageBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YmageBackendApplication.class, args);
    }

}
