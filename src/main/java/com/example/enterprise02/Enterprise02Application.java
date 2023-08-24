package com.example.enterprise02;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.enterprise02")
public class Enterprise02Application {

    public static void main(String[] args) {
        SpringApplication.run(Enterprise02Application.class, args);
    }

}
