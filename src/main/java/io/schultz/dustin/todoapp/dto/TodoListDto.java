package io.schultz.dustin.todoapp.dto;

import java.util.ArrayList;
import java.util.List;

public class TodoListDto {

    private String name;
    private List<TodoItemDto> items = new ArrayList<>();

    public TodoListDto(String name, List<TodoItemDto> items) {
        this.name = name;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public List<TodoItemDto> getItems() {
        return items;
    }

    public void addItem(TodoItemDto item) {
        this.items.add(item);
    }
}
