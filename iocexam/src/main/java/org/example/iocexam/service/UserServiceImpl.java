package org.example.iocexam.service;

import org.example.iocexam.dao.UserDao;
import org.example.iocexam.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
//    @Autowired
    private UserDao userDao;  //필드기반주입

    //설정자 주입을 위해서 필요.
    @Autowired //ComponentScan은 기본으로 생성자를 통해 주입하므로, 설정자를통해 주입받고싶다면 @Autowired를 붙힌다.
    @Qualifier("userDaoImpl")
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    //생성자주입하려면 필요!!
//    public UserServiceImpl(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public void joinUser(User user) {
        //회원가입을 위한 비지니스 코드가 작성되어야함..

        //회원가입을 위한 비지니스가 수행되면.. 해당 데이터를 저장하는 코드가 실행
        userDao.addUser(user);
    }
}
