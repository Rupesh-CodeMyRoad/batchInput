package com.demo.springdatajpabatchinsertion;

import org.aopalliance.intercept.MethodInterceptor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringDataJpaBatchInsertionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaBatchInsertionApplication.class, args);
    }

}
