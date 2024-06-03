package org.example.restexam.service;

import org.example.restexam.domain.Todo;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
//@Transactional
class TodoServiceTest {
    @Autowired TodoService service;
    private static final Logger log = LoggerFactory.getLogger(TodoServiceTest.class);

    @Test
    void getTodos() {
        List<Todo> todos = service.getTodos();
        todos.forEach(todo -> log.info("Todo:::"+todo));
    }

    @Test
    void getTodo() {
        Todo todo = service.getTodo(1L);
        log.info("Todo::::::::"+todo);
    }

    @Test
    void addTodo() {
        Todo todo1 = service.addTodo("Todo4");
        log.info("Todo::::"+todo1);
    }

    @Test
    void updateTodoById() {
        log.info("Before Todo::::::::"+service.getTodo(1L));
        Todo todo = service.updateTodo(1L);
        log.info("After Todo:::::::::"+todo);
    }

    @Test
    void updateTodo() {
        Todo todo = new Todo("updte Todo");
        todo.setId(1L);
        log.info("Before Todo :::::::::::: "+ service.getTodo(1L));
        service.updateTodo(todo);
        log.info("After Todo :::::::::::: "+ service.getTodo(1L));
    }

    @Test
    void deleteTodo() {
        service.deleteTodo(1L);
        log.info("Todo:::"+service.getTodo(1L));
    }
}