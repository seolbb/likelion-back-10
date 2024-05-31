package org.example.iocexam.config;

import org.example.iocexam.controller.UserController;
import org.example.iocexam.dao.UserDao;
import org.example.iocexam.dao.UserDaoImpl;
import org.example.iocexam.service.UserService;
import org.example.iocexam.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "org.example.iocexam")
public class UserConfig {

    //IOC 컨테이너에 Bean을 등록하는 방법을 생각해보고 동작 될 수 있도록 작성해주세요.
    //1. javaconfig를 이용해서 동작되도록!!
//    @Bean
//    public UserDao userDao(){
//        return new UserDaoImpl();
//    }
//
//    @Bean
//    public UserService userService(UserDao userDao){
//        UserServiceImpl userService = new UserServiceImpl();
//        //userDao 값을 넣어주는 setter 메서드 필요.
//        userService.setUserDao(userDao);
//        return userService;
//
////        return new UserServiceImpl(userDao); // userDao를 인자로 받는 생성자필요.
//    }
//
//    @Bean
//    public UserController userController(UserService userService){
//        return new UserController(userService);
//    }


    //2. componentScan 을 이용해서 동작되도록...     코드를 완성해보세요.
    //2-1. 누가 컴포넌트인지 알려준다.
    //2-2. componentScan 을 추가한다.

}
