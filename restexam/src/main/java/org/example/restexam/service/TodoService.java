package org.example.restexam.service;

import lombok.RequiredArgsConstructor;
import org.example.restexam.domain.Todo;
import org.example.restexam.repository.TodoRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TodoService {
    private final TodoRepository todoRepository;

    @Transactional(readOnly = true)
    public List<Todo> getTodos(){
        return todoRepository.findAll(Sort.by("id").descending());
    }

    @Transactional(readOnly = true)
    public Todo getTodo(Long id){
        return todoRepository.findById(id).get();
    }

    @Transactional
    public Todo addTodo(String todo){
        return todoRepository.save(new Todo(todo));
    }

    @Transactional
    public Todo updateTodo(Long id){  //id 값에 해당하는 done 을 토글하도록.
        Todo updateTodo=null;
        try{
            updateTodo = todoRepository.findById(id).orElseThrow();
            updateTodo.setDone(!updateTodo.isDone());
        }catch (Exception e){
            System.out.println(e);
        }
        return updateTodo;
    }

    @Transactional
    public Todo updateTodo(Todo todo){  //id에 해당하는 todo 정보를 바꾸고 싶어요.
        Todo updateTodo = null;
        try{
            updateTodo = todoRepository.save(todo);
        }catch (Exception e){
            e.printStackTrace();        }
        return updateTodo;
    }

    @Transactional
    public void deleteTodo(Long id){ //id에 해당하는 todo 삭제
        Optional<Todo> findTodo = todoRepository.findById(id);
        if(findTodo.isEmpty())
            return;
        todoRepository.delete(findTodo.get());
    }

}
