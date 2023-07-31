package com.todo.todo.Service;

import com.todo.todo.Entity.TodoItem;
import com.todo.todo.Repository.todoRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Service
public class todoService {
    private  final todoRepository repository;
    public todoService(todoRepository repository) {
        this.repository = repository;
    }
    public void saveItem(TodoItem todoItem){
        repository.save(todoItem);
    }
    public List<TodoItem> findAll(){
        return repository.findAll();
    }

    public TodoItem update(TodoItem todoItem){
           return repository.save(todoItem);
    }
    public void delete(String id){
        repository.deleteById(UUID.fromString(id));
    }
}
