package org.example.springdatajpa.userexam;

import java.util.List;

public interface UserRepositoryCustom {
    List<User> findUsersByName(String name);
    public List<User> findUsersDynamically(String name, String email);
}