package org.example.springdatajdbc01;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.support.PageableExecutionUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RequiredArgsConstructor
public class CustomUserRepositoryImpl implements CustomUserRepository{
    private final NamedParameterJdbcTemplate jdbcTemplate;
    @Override
    public Page<User> findAllUsersWithPagination(Pageable pageable) {
        // 여러줄의 쿼리를 작성할 때는 """를 사용합니다.
        String countQuery = """
                   SELECT
                    COUNT(*)
                    FROM users
                   """;
        String query = "SELECT id, name, email FROM users LIMIT :limit OFFSET :offset";

        Map<String, Object> params = new HashMap<>();
        params.put("limit", pageable.getPageSize());
        params.put("offset", pageable.getOffset());

        List<User> users = jdbcTemplate.query(query, params, new BeanPropertyRowMapper<>(User.class));
        // 페이징 처리를 위해서는 count를 구하는 쿼리와 결과를 가지고 오는 쿼리 모두 필요하다.
        return PageableExecutionUtils.getPage(users, pageable,
                () -> jdbcTemplate.queryForObject(countQuery, params, Long.class));
    }
}

