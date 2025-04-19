package com.sb;

import com.sb.beans.Motor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Hello world!
 */
@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(TestApplication.class,args);
        Motor motor = applicationContext.getBean(Motor.class);
        System.out.println(motor);

    }
}
