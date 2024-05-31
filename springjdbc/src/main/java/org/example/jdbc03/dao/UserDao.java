package org.example.jdbc03.dao;

import java.util.List;

public interface UserDao {
    void insertUser(User user);
    List<User> findAllUsers();
    void updateUserEmail(String name, String email);
    void deleteUser(String name);
}
