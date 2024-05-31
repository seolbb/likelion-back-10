package org.example.springjdbc07;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SpringJdbc07Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringJdbc07Application.class,args);
    }
    @Bean
    public CommandLineRunner demo(JdbcTemplate jdbcTemplate) {
        return args -> {
            // Text Blocks를 사용한 멀티 라인 SQL 쿼리
            String sql = """
                         INSERT INTO users (name, email)
                         VALUES (?, ?);
                         """;

            jdbcTemplate.update(sql, "Esther22", "esther@example.com");

            // 멀티 라인 쿼리로 여러 개의 데이터 조회
            String query = """
                           SELECT id, name, email
                           FROM users
                           WHERE email LIKE ?;
                           """;
            jdbcTemplate.query(query, rs -> {
                while (rs.next()) {
                    System.out.println("User: " + rs.getString("name") + " - " + rs.getString("email"));
                }
            }, "%example.com");
        };
    }
}

