package com.example.demojavafamily;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhujian
 */
@SpringBootApplication(scanBasePackages = {"com.example"})
public class DemoJavaFamilyApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoJavaFamilyApplication.class, args);
    }

}
