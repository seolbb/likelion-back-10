package org.example.profile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
       ApplicationContext context = SpringApplication.run(MainApplication.class,args);
       DataService service = context.getBean(DataService.class);
        System.out.println(service.getEnvironment());
    }
}
