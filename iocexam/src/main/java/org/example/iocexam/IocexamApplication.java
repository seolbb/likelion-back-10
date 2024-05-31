package org.example.iocexam;

import org.example.iocexam.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class IocexamApplication {

    public static void main(String[] args) {

       ApplicationContext context =  SpringApplication.run(IocexamApplication.class, args);

        UserController userController = context.getBean(UserController.class);
        userController.joinUser();
    }

}
