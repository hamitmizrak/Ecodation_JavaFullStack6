package com.hamitmizrak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

//exclude:dahil etmemek
@SpringBootApplication(exclude = {
        SecurityAutoConfiguration.class,
        //org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        //org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class
}
)
//@SpringBootApplication

//Auditing
@EnableJpaAuditing(auditorAwareRef = "auditorAwareBean")

public class EcodationJavaFullStack6Application {

    public static void main(String[] args) {

        //devtool active inactive
        System.setProperty("spring.devtools.restart.enabled", "true");

        //Disables headless JOptionPane
        System.setProperty("java.awt.headless", "false");

        SpringApplication.run(EcodationJavaFullStack6Application.class, args);
    }

}
