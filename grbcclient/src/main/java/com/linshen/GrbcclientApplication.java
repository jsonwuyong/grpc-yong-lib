package com.linshen;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mapper")
public class GrbcclientApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrbcclientApplication.class, args);
    }

}
