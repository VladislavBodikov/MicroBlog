package ru.bodikov.microblog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableAutoConfiguration
//@EnableMongoRepositories(basePackages = "ru.bodikov.microblog.repository")
public class MicroBlogApplication {
    public static void main(String[] args) {
        SpringApplication.run(MicroBlogApplication.class,args);
    }
}
