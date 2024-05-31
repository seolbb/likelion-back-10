

-- root 권한에서 실행한다.

#### 문제 1: liondb 라는 이름으로 데이터베이스를 생성해 주세요.

create database liondb;

#### 문제 2: user명 lion password는 like로 user를 생성해 주세요.

create user 'lion'@'%' identified by 'like';
create user 'lion'@'localhost' identified by 'like';

#### 문제 3: lion user가 liondb를 사용할 수 있도록 권한을 부여해 주세요.

GRANT ALL PRIVILEGES ON liondb.* TO 'lion'@'%';
GRANT ALL PRIVILEGES ON liondb.* TO 'lion'@'localhost';

#### 문제 4: user, user_role, role, board  테이블을 제약 조건들을 적절히 이용해서 생성해 주세요.  

use liondb;

drop table if exists  user;

create table user (
                      user_id INT PRIMARY KEY AUTO_INCREMENT,
                      email VARCHAR(255) NOT NULL unique,
                      name VARCHAR(50) NOT NULL,
                      password VARCHAR(500) NOT NULL,
                      regdate TIMESTAMP DEFAULT NOW()
);

drop table if exists role;

create table role (
                      role_id  INT PRIMARY KEY,
                      name VARCHAR(20)
);

drop table if exists user_role;

create table user_role (
                           user_id INT,
                           role_id INT,
                           primary key(user_id, role_id),
                           FOREIGN KEY (user_id) REFERENCES user(user_id),
                           FOREIGN KEY (role_id) REFERENCES role(role_id)
);

drop table if exists  board;

CREATE TABLE board (
                       board_id INT PRIMARY KEY AUTO_INCREMENT,
                       title VARCHAR(100) NOT NULL,
                       content TEXT NULL,
                       user_id INT NOT NULL,
                       regdate TIMESTAMP DEFAULT NOW(),
                       view_cnt INT DEFAULT 0,
                       FOREIGN KEY (user_id) REFERENCES user(user_id)
);

#### 문제 5: 각 테이블에 적절한 샘플 데이터를 입력해 주세요.  

insert into role(role_id, name) values ( 1, 'ROLE_USER');
insert into role(role_id, name) values ( 2, 'ROLE_ADMIN');

insert into user (email, name, password, regdate)
values ( 'urstory@gmail.com', '김성박', '1234', now());

insert into user_role(user_id, role_id) values( last_insert_id(), 1);

select u.email, u.name, u.password, r.name
from user u, user_role ur, role r
where u.user_id = ur.user_id and ur.role_id = r.role_id
  and email = 'urstory@gmail.com';

insert into board(title, content, user_id, regdate) values ( 'title1', 'content1', 1, now());


#### 문제 6: 수정,삭제 조회등 쿼리를 연습해 보세요.   (연습쿼리도 기록해주세요.) 

select board_id, title, content, user_id, regdate, view_cnt
from board
order by board_id desc limit 0, 10;

select board_id, title, content, user_id, regdate, view_cnt
from board
where board_id = 1;

update board
set view_cnt = view_cnt + 1
where board_id = 1;