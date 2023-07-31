package com.todo.todo.Repository;

import com.todo.todo.Entity.TodoItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface todoRepository extends JpaRepository<TodoItem, UUID> {

}
