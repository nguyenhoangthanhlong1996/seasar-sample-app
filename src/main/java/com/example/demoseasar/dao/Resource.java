package com.example.demoseasar.dao;

import com.example.demoseasar.models.Todo;

import java.util.HashMap;
import java.util.Map;

public class Resource {

    public static Map<Integer, Todo> todos = new HashMap<Integer, Todo>() {{
        put(1, new Todo(1, "Task 1", Boolean.TRUE));
        put(2, new Todo(1, "Task 2", Boolean.TRUE));
        put(3, new Todo(1, "Task 3", Boolean.TRUE));
    }};


}
