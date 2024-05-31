package org.example.springdatajpa.customerexam;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
@Slf4j
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }

    @Bean
    public CommandLineRunner run(CustomerRepository customerRepository){
        return args -> {

            // 이름으로 고객 조회
            List<Customer> customersByName = customerRepository.findByName("홍길동");
            customersByName.forEach(customer -> log.info("이름으로 찾은 고객: " + customer.getName()));

            // 이메일 포함 조건으로 고객 조회
            List<Customer> customersByEmail = customerRepository.findByEmailContaining("example");
            customersByEmail.forEach(customer -> log.info("이메일 포함 조건으로 찾은 고객: " + customer.getEmail()));

            // 고객의 주문 수 조회
            List<Object[]> customerOrderCounts = customerRepository.findCustomerOrderCount();
            customerOrderCounts.forEach(result -> {
                Customer customer = (Customer) result[0];
                Long count = (Long) result[1];
                log.info("고객: " + customer.getName() + ", 주문 수: " + count);
            });

            // 고객과 그들의 가장 최근 주문 조회
            List<Object[]> customersWithOrders = customerRepository.findCustomersWithLatestOrder();
            customersWithOrders.forEach(result -> {
                Customer customer = (Customer) result[0];
                Order order = (Order) result[1];
                log.info("고객: " + customer.getName() + ", 최근 주문: " + order.getProduct());
            });

            // 평균 나이 이상의 고객 조회
            List<Customer> customersOlderThanAverage = customerRepository.findCustomersOlderThanAverage();
            customersOlderThanAverage.forEach(customer -> log.info("평균 나이 이상의 고객: " + customer.getName()));
        };
    }
}
