package io.schultz.dustin.todoapp.converter;

import io.schultz.dustin.todoapp.dto.TodoItemDto;
import io.schultz.dustin.todoapp.dto.TodoListDto;
import io.schultz.dustin.todoapp.model.TodoItem;
import io.schultz.dustin.todoapp.model.TodoList;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class TodoListConverter implements Converter<TodoList, TodoListDto> {

    private TodoItemConverter itemConverter;

    @Inject
    public TodoListConverter(TodoItemConverter itemConverter) {
        this.itemConverter = itemConverter;
    }

    @Override
    public TodoListDto convert(TodoList todoList) {
        List<TodoItem> items = todoList.getItems();

        List<TodoItemDto> itemDtos = items.stream()
                .map(itemConverter::convert)
                .collect(Collectors.toList());

        return new TodoListDto(todoList.getName(), itemDtos);
    }
}
