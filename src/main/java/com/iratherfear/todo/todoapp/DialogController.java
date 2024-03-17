package com.iratherfear.todo.todoapp;

import com.iratherfear.todo.todoapp.datamodel.TodoData;
import com.iratherfear.todo.todoapp.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {
    @FXML
    private TextField shortDescField;

    @FXML
    private TextArea longDescField;

    @FXML
    private DatePicker deadlineField;

    public TodoItem processResult() {
        String shortDesc = shortDescField.getText().trim();
        String longDesc = longDescField.getText().trim();
        LocalDate deadline = deadlineField.getValue();
        TodoItem newItem = new TodoItem(shortDesc, longDesc, deadline);
        TodoData.getInstance().addTodoItems(newItem);
        return newItem;
    }
}
