package com.restclient.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restclient.demo.entity.Todo;

@RestController
@RequestMapping("/todos")
public class Controller {

    @Autowired
    private TodoService todoService;

    @GetMapping("/{id}")
    public Todo getSingleTodo(@PathVariable int id) {
        return this.todoService.getTodo(id);
    }

    @GetMapping("/")
    public List<Todo> getAllTodos() {
        return this.todoService.getAllTodos();
    }
}
