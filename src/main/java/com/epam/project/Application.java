package com.epam.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

@SpringBootApplication
public class Application {

    @Bean
    public Clazz clazz() {
        return new Clazz();
    }

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Application.class, args);
        Clazz clazz = run.getBean("clazz", Clazz.class);
        System.out.println(clazz);
        System.out.println("ПЕЧАТАЕМ ПАРАМЕТРЫ: " + Arrays.toString(args));
    }

}

class Clazz {


}
