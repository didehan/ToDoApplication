package com.todo.todo.Controller;


import com.todo.todo.Entity.TodoItem;
import com.todo.todo.Service.todoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(value = "/todo")
public class todoController {
    private final todoService todoService;

    public todoController(todoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/findAll")
    public List<TodoItem> findAll(){
        return todoService.findAll();
    }

    @PostMapping("/save")
    public void save(@RequestBody TodoItem todoItem){
        todoService.saveItem(todoItem);
    }
    @PutMapping("/update")
    public TodoItem update(@RequestBody TodoItem todoItem) {
        return todoService.update(todoItem);
    }
    @DeleteMapping("/delete/{idd}")
    public void delete(@PathVariable String idd) throws Exception{
        todoService.delete(idd);
    }
}
