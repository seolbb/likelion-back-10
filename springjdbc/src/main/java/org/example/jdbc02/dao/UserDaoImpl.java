package org.example.jdbc02.dao;

import com.mysql.cj.result.Row;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
@RequiredArgsConstructor
@Repository
public class UserDaoImpl implements UserDao{
    //JdbcTemplate 객체이용해서 구현 할거니까..
    //필드기반
//    @Autowired
    private final JdbcTemplate jdbcTemplate;

   //생성자기반
//    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }
//
//    //설정자기반
//    @Autowired
//    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
//        this.jdbcTemplate = jdbcTemplate;
//    }

    @Override
    public void insertUser(User user) {
        String sql = "INSERT INTO users(name,email) VALUES (?,?)";
        jdbcTemplate.update(sql, user.getName(), user.getEmail());
    }

    @Override
    public List<User> findAllUsers() {

        RowMapper<User> rowMapper = (ResultSet rs, int rowNum) ->new User(
                rs.getLong("id"),
                rs.getString("name"),
                rs.getString("email")
        );
//        RowMapper<User> rowMapper2 = new RowMapper<User>() {
//            @Override
//            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new User(
//                    rs.getLong("id"),
//                    rs.getString("name"),
//                    rs.getString("email")
//                );
//            }
//        };

        return jdbcTemplate.query("SELECT * FROM users",rowMapper);
    }

    @Override
    public void updateUserEmail(String name, String email) {
        String sql = "UPDATE users SET email = ? where name = ?";
        jdbcTemplate.update(sql,email,name);
    }

    @Override
    public void deleteUser(String name) {
        String sql = "DELETE FROM users WHERE name =?";
        jdbcTemplate.update(sql,name);
    }

//   static class UserMapper implements RowMapper<User>{
//        @Override
//        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//            User user = new User(rs.getLong("id"), rs.getString("name"),rs.getString("email"));
//            return user;
//        }
//    }
}
