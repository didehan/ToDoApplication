package com.todo.todo.Entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "todo_list")
@Getter
@Setter
public class TodoItem {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "idd")
    private UUID id;
    @Column(name = "title")
    private String title;
    @Column(name = "done")
    private boolean done;

}
