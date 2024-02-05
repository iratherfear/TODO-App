package com.iratherfear.todo.todoapp.datamodel;

import java.time.LocalDate;

public class TodoItem {
    private String shortDesc;
    private String longDesc;
    private LocalDate deadline;

    public TodoItem(String shortDesc, String longDesc, LocalDate deadline) {
        this.shortDesc = shortDesc;
        this.longDesc = longDesc;
        this.deadline = deadline;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return shortDesc;
    }
}
