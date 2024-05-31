package org.example.jdbc03.dao;

import lombok.RequiredArgsConstructor;
import org.example.jdbc03.UserNotFoundException;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.util.List;
@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name,email) VALUES (?,?)";
        try {
            jdbcTemplate.update(sql, user.getName(), user.getEmail());
        }catch (DataAccessException e){
            throw new DataAccessException("사용자를 입력하다 오류 발생 "+ user.getName(),e){};
        }
    }

    @Override
    public List<User> findAllUsers() {
        try {
            RowMapper<User> rowMapper = (rs, rowNum) -> new User(
                    rs.getLong("id"),
                    rs.getString("name"),
                    rs.getString("email")
            );
            return jdbcTemplate.query("SELECT * FROM users", rowMapper);
        } catch (DataAccessException e) {
            throw new DataAccessException("Error retrieving users", e) {};
        }
    }
    @Override
    public void updateUserEmail(String name, String email) {
        int updated = jdbcTemplate.update("UPDATE users SET email = ? WHERE name = ?", email, name);
        if (updated == 0) {
            throw new UserNotFoundException("No user found with name: " + name);
        }
    }

    @Override
    public void deleteUser(String name) {
        int deleted = jdbcTemplate.update("DELETE FROM users WHERE name = ?", name);
        if (deleted == 0) {
            throw new UserNotFoundException("No user found with name: " + name);
        }
    }
}
