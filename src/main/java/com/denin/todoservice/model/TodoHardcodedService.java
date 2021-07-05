package com.denin.todoservice.model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class TodoHardcodedService {
    private static List<ToDo> todos = new ArrayList<>();
    private static int idCounter = 0;
    static {
        todos.add(new ToDo(++idCounter, "denin16","learn to Code", new Date(),false));
        todos.add(new ToDo(++idCounter, "denin16","learn about microservices", new Date(),false));
        todos.add(new ToDo(++idCounter, "denin16","learn about angular", new Date(),false));
    }

    public List<ToDo> finaAll(){
        return todos;
    }
}

