package com.learn.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication @ComponentScan({"com.learn.topic", "com.learn.course"}) @EnableJpaRepositories({"com.learn.topic", "com.learn.course"}) @EntityScan(basePackages = {"com.learn.topic","com.learn.course"})
public class CourseApiApp {

    public static void main(String[] args) {

        SpringApplication.run(CourseApiApp.class,args);

    }
}
