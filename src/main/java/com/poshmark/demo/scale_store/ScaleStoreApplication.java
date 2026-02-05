package com.poshmark.demo.scale_store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.poshmark.demo")
@EntityScan("com.poshmark.demo.model")
@EnableJpaRepositories("com.poshmark.demo.repository")
public class ScaleStoreApplication {
    public static void main(String[] args) {
        SpringApplication.run(ScaleStoreApplication.class, args);
    }
}
