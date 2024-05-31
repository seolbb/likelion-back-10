package org.example.springdatajpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional  // 테스트코드의 트랜잭션은 기본이 롤백이다.
@Rollback(value = false)    // 따라서 테스트코드에서도 데이터를 확인하고싶으면 false로 두어야한다.
class UserRepositoryTest {
    @Autowired
    private UserRepository repository;

    @Test
    void save(){
        User user = new User("kim", "kim@test.com");
        repository.save(user);

        System.out.println(user.getId());
    }

    @Test
    void findByName(){
        List<User> users = repository.findByName("kang");
//        assertThat(users.size()).isEqualTo(4);
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void findByEmail(){
        List<User> users = repository.findByEmail("kang@example.com");
//        assertThat(users.size()).isEqualTo(4);
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void findByNameAndEmail(){
        List<User> users = repository.findByNameAndEmail("kang", "kang@example.com");
//        assertThat(users.size()).isEqualTo(4);
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void findByNameOrEmail(){
        List<User> users = repository.findByNameOrEmail("kang", "kang@example.com");
//        assertThat(users.size()).isEqualTo(4);
        assertThat(users.size()).isEqualTo(3);
    }

    @Test
    void updateUserEmail(){
        repository.updateUserEmail(4L, "kang@test.com");

        Optional<User> user = repository.findById(4L);
        assertThat(user.get().getEmail()).isEqualTo("kang@test.com");
    }

    @Test
    void deleteByEmail(){
        int count = repository.deleteByEmail("kang@example.com");
        assertThat(count).isEqualTo(1); // 이메일이 중복되는 경우가 없을때만 1로 return 됨.
    }
}