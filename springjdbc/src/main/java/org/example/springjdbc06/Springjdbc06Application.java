package org.example.springjdbc06;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Springjdbc06Application {
    public static void main(String[] args) {
        SpringApplication.run(Springjdbc06Application.class, args);
    }

    @Bean
    public CommandLineRunner run(UserDao userDao){
        return args -> {
          User user = new User(null,"Esther", "esther@example.com");
            userDao.insertUser(user);
            System.out.println("user 입력 성공!!");
        };
    }

}
