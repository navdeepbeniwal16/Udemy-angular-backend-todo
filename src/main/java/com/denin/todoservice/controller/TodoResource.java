package com.denin.todoservice.controller;

import com.denin.todoservice.model.ToDo;
import com.denin.todoservice.model.TodoHardcodedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TodoResource {

    @Autowired
    private TodoHardcodedService todoHardcodedService;

    @GetMapping("/users/{username}/todos")
    public List<ToDo> getAllTodos(@PathVariable String username){
        return todoHardcodedService.finaAll();
    }

}
