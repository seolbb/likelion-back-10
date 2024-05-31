package org.example.message2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MainApplication {
    public static void main(String[] args) {
        ApplicationContext context =  SpringApplication.run(MainApplication.class,args);
        MessageService service = context.getBean(MessageService.class);
        System.out.println(service.getMessage());
    }
}
