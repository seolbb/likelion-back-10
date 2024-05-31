drop table jpa_order;
drop table jpa_customer;
CREATE TABLE jpa_customer (
                              id BIGINT NOT NULL AUTO_INCREMENT,
                              name VARCHAR(255),
                              email VARCHAR(255),
                              age INT,
                              PRIMARY KEY (id)
);

CREATE TABLE jpa_order (
                           id BIGINT NOT NULL AUTO_INCREMENT,
                           product VARCHAR(255),
                           date DATE,
                           customer_id BIGINT,
                           PRIMARY KEY (id),
                           FOREIGN KEY (customer_id) REFERENCES jpa_customer(id)
);

INSERT INTO jpa_customer (name, email, age) VALUES ('홍길동', 'hong@example.com', 30);
INSERT INTO jpa_customer (name, email, age) VALUES ('김철수', 'kim@example.com', 25);
INSERT INTO jpa_customer (name, email, age) VALUES ('이영희', 'lee@example.com', 27);
INSERT INTO jpa_customer (name, email, age) VALUES ('박민수', 'park@example.com', 35);
INSERT INTO jpa_customer (name, email, age) VALUES ('최지현', 'choi@example.com', 40);
INSERT INTO jpa_customer (name, email, age) VALUES ('정수현', 'jung@example.com', 22);
INSERT INTO jpa_customer (name, email, age) VALUES ('강지훈', 'kang@example.com', 28);
INSERT INTO jpa_customer (name, email, age) VALUES ('윤서준', 'yoon@example.com', 33);
INSERT INTO jpa_customer (name, email, age) VALUES ('오지영', 'oh@example.com', 29);
INSERT INTO jpa_customer (name, email, age) VALUES ('임도연', 'lim@example.com', 31);

INSERT INTO jpa_order (product, date, customer_id) VALUES ('노트북', '2024-05-01', 1);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('스마트폰', '2024-05-02', 1);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('태블릿', '2024-05-03', 2);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('키보드', '2024-05-04', 2);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('마우스', '2024-05-05', 3);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('모니터', '2024-05-06', 4);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('프린터', '2024-05-07', 5);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('헤드셋', '2024-05-08', 6);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('웹캠', '2024-05-09', 7);
INSERT INTO jpa_order (product, date, customer_id) VALUES ('스피커', '2024-05-10', 8);