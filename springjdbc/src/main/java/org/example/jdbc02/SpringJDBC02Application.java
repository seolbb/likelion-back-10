package org.example.jdbc02;

import org.example.jdbc02.dao.User;
import org.example.jdbc02.dao.UserDao;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringJDBC02Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJDBC02Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(UserDao userDao){
        return args -> {
          //insert test
//          userDao.insertUser(new User(null,"hong","hong@exam.com"));

            //update test
//            userDao.updateUserEmail("hong","hong-new@exam.com");

            //delete test
            userDao.deleteUser("hong");

           List<User> users = userDao.findAllUsers();
           for(User user : users){
               System.out.println(user.getName() +" , "+user.getEmail());
           }
        };
    }
}
