package com.restclient.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

import com.restclient.demo.entity.Todo;

@Service
public class TodoService {

    @Autowired
    private RestClient restClient;

    public Todo getTodo(int id) {
        Todo body = restClient.get().uri("/todos/{id}", id).retrieve()
                .body(Todo.class);
        return body;
    }

    public List<Todo> getAllTodos() {
        return restClient.get().uri("/todos").retrieve()
                .body(new ParameterizedTypeReference<List<Todo>>() {
                });
    }
}
