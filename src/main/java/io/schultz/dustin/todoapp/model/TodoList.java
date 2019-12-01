package io.schultz.dustin.todoapp.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "TODO_LIST")
public class TodoList {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "todo_list_id")
    private Long id;

    @Column(nullable = false)
    private String name;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "todo_list_id")
    private List<TodoItem> items = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TodoItem> getItems() {
        return items;
    }

    public void setItems(List<TodoItem> items) {
        this.items = items;
    }

    public void addTodoItem(TodoItem item) {
        this.items.add(item);
    }
}
