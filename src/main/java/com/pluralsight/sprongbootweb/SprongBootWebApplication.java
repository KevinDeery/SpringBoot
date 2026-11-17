package com.pluralsight.sprongbootweb;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.LoggerFactoryFriend;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SprongBootWebApplication implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(SprongBootWebApplication.class);

    @Value("${example.message:None}") // pulled for the application properties unless specifying - None
    private String message;

    public static void main(String[] args) {
        SpringApplication.run(SprongBootWebApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        LOG.info("Message: {}", message);
    };

}
