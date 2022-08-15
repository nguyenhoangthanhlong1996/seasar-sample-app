package com.example.demoseasar.services;

import com.example.demoseasar.dao.Resource;
import com.example.demoseasar.models.Todo;

import java.util.HashSet;
import java.util.Set;

public class TodoServiceImpl implements TodoServiceIF {

    @Override
    public Set<Todo> list() {
        return new HashSet<>(Resource.todos.values());
    }

    @Override
    public Todo detail(Integer id) {
        return Resource.todos.get(id);
    }

    @Override
    public Todo create(String title, Boolean completed) {
        return null;
    }

    @Override
    public Todo update(Integer id, String title, Boolean completed) {
        return null;
    }

    @Override
    public Todo delete(Integer id) {
        return null;
    }

}
