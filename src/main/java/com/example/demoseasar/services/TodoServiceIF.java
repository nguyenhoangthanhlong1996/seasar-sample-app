package com.example.demoseasar.services;

import com.example.demoseasar.models.Todo;

import java.util.Set;

public interface TodoServiceIF {

    Set<Todo> list();

    Todo detail(Integer id);

    Todo create(String title, Boolean completed);

    Todo update(Integer id, String title, Boolean completed);

    Todo delete(Integer id);

}
