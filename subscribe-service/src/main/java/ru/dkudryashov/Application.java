package ru.dkudryashov;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by d.kudryashov on 02.02.2017.
 */
@SpringBootApplication
@ComponentScan(basePackages = "ru.dkudryashov")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

}

