package org.example.springjdbc02;

import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao{
    private final JdbcTemplate jdbcTemplate;
    @Override
    public void createAndUpdateUser(String name, String email, String newEmail) {
        jdbcTemplate.update("INSERT INTO users(name,email) VALUES (?,?)",name, email);   //a계좌에 입금
        if(newEmail.contains("error")){   //일부러 예외를 발생 시키기 위한 부분!!
            throw new RuntimeException("Simulated error");
        }
        jdbcTemplate.update("UPDATE users SET email = ? where name=?", newEmail,name);  //b계좌에서 출금
    }
}
