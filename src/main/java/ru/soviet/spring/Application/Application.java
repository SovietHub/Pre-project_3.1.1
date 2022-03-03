package ru.soviet.spring.Application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@ComponentScan(basePackages = "ru.soviet.spring")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}