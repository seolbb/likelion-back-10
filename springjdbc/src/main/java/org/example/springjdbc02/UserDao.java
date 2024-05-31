package org.example.springjdbc02;

import org.springframework.transaction.annotation.Transactional;

public interface UserDao {
//    @Transactional
    void createAndUpdateUser(String name, String email, String newEmail);
}
