package io.schultz.dustin.todoapp.dto;

public class TodoItemDto {

    private String value;
    private boolean complete;

    public TodoItemDto(String value, boolean complete) {
        this.value = value;
        this.complete = complete;
    }

    public String getValue() {
        return value;
    }

    public boolean isComplete() {
        return complete;
    }
}
