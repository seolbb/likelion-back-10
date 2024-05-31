package org.example.springdatajpa.customerexam;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/*

CREATE TABLE jpa_order (
        id BIGINT NOT NULL AUTO_INCREMENT,
        product VARCHAR(255),
date DATE,
customer_id BIGINT,
PRIMARY KEY (id),
FOREIGN KEY (customer_id) REFERENCES jpa_customer(id)
        );
 */
@Entity
@Table(name="jpa_order")
@Setter@Getter
@NoArgsConstructor
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String product;
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Order(String product, LocalDate date, Customer customer) {
        this.product = product;
        this.date = date;
        this.customer = customer;
    }
}
