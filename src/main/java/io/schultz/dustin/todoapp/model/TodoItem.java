package io.schultz.dustin.todoapp.model;

import javax.persistence.*;

@Entity
@Table(name = "TODO_ITEM")
public class TodoItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "todo_item_id")
    private Long id;

    @Column(nullable = false)
    private String item;

    @Column(nullable = false)
    private boolean complete;

    @ManyToOne
    @JoinColumn(name = "todo_list_id", insertable = false, updatable = false)
    private TodoList todoList;

    public Long getId() {
        return id;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
