package org.example.springjdbc05;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

@SpringBootApplication
public class Springjdbc05Application {
    public static void main(String[] args) {
        SpringApplication.run(Springjdbc05Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate){
        return args -> {
            String sql = "SELECT id, name, email FROM users";
            User user = jdbcTemplate.query(sql, new UserResultSetExtractor());
            System.out.println(user);
        };
    }

    private static class UserResultSetExtractor implements ResultSetExtractor<User>{
        //ResultSetExtractor 결과 집합 전체를 단일 객체로 변환 하는데 사용됨..
        //여러 테이블에서 조인된 결과를 받아서 하나의 복합 객체로 매핑..  특정 조건에 따라 다양한 타입의 객체를 리스트에 추가할 때 사용할 수 있다.
        //메소드가 한 번만 호출되서 전체 결과 집합을 처리해준다.
        @Override
        public User extractData(ResultSet rs) throws SQLException, DataAccessException {
            User user = new User();
            if(rs.next()){
                user.setId(rs.getLong("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));

//                List<Role> roles = new ArrayList<>();
//                do{
//                    Ro
//                }while(rs.next());
                //지금 예제는 user 하나에 대한 값만 채우는거라 RowMapper와 크게 차이는 없어 보이지만...
                //게시글 이라면..  게시글 하나에..  댓글 리스트가 필드로 들어와 있을 수 있을거예요.
            }
            return user;
        }
    }
}
