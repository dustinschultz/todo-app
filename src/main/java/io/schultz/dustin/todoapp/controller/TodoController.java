package io.schultz.dustin.todoapp.controller;

import io.schultz.dustin.todoapp.dto.TodoListDto;
import io.schultz.dustin.todoapp.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;

@RestController
@RequestMapping("/todo")
public class TodoController {

    private TodoService todoService;

    @Inject
    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping("/lists")
    public List<TodoListDto> getTodoLists() {
        return todoService.getTodoLists();
    }
}
