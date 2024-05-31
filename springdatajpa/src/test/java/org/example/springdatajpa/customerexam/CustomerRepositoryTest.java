package org.example.springdatajpa.customerexam;

import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
class CustomerRepositoryTest {
    private static final Logger log = LoggerFactory.getLogger(CustomerRepositoryTest.class);
    @Autowired
    private CustomerRepository customerRepository;

    @Test
    void save(){
        Customer customer = new Customer("손설빈", "seolb@exam.com", 30);
        customerRepository.save(customer);
        assertThat(customerRepository.findById(11L).get().getName()).isEqualTo("손설빈");
    }

    @Test
    void delete(){
        customerRepository.deleteById(11L);
    }

    @Test
    @DisplayName("고객명으로 조회")
    void findByName(){
        List<Customer> user = customerRepository.findByName("손설빈");
        for(Customer c : user){
            log.info(c.getName() + " :: " + c.getEmail());
        }
    }

    @Test
    void findByEmailContaining(){
//        List<Customer> exams = customerRepository.findByEmailContaining("exam");
//        exams.forEach(customer -> log.info(customer.getName() + " :: " + customer.getEmail()));

        // 시나리오를 짜서 테스트하는것이 원칙이다.
        // Given
        Customer customer1 = new Customer("user1", "user1@test.com");
        Customer customer2 = new Customer("user2", "user2@test.com");
        Customer customer3 = new Customer("user3", "user3@test.com");

        customerRepository.save(customer1);
        customerRepository.save(customer2);
        customerRepository.save(customer3);

        // When
        List<Customer> customers = customerRepository.findByEmailContaining("test");

        // Then
        assertThat(customers).hasSize(3);
    }

    @Test
    void findCustomerOrderCount(){
        List<Object[]> customerOrderCount = customerRepository.findCustomerOrderCount();
        customerOrderCount.forEach(result -> {
            Customer customer = (Customer) result[0];
            Long count = (Long)result[1];
            log.info("고객 이름 : {}, 주문 수 : {}", customer.getName(), count);
        });
    }

    @Test
    void testFindByName() {
    }

    @Test
    void findByEmail() {
    }

    @Test
    void testFindByEmailContaining() {
    }

    @Test
    void testFindCustomerOrderCount() {
    }

    @Test
    void findCustomersWithLatestOrder() {
    }

    @Test
    @SqlGroup({
            @Sql(value = "classpath:db/test.sql",
                    config = @SqlConfig(encoding = "utf-8", separator = ";", commentPrefix = "--"),
                    executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
    })
    void findCustomersOlderThanAverage() {
        List<Customer> customersOlderThanAverage = customerRepository.findCustomersOlderThanAverage();

        assertThat(customersOlderThanAverage).hasSize(4)
                .extracting(Customer::getName)
                .contains("최지현");

    }

    @BeforeAll
    static void setUp(){
        log.info("---------> BeforeAll");
    }
    @AfterAll
    static void tearDown(){
        log.info("---------> AfterAll");
    }

    @BeforeEach
    void BeforeEach(){
        log.info("---------> BeforeEach");
    }
    @AfterEach
    void AfterEach(){
        log.info("---------> AfterEach");
    }
}