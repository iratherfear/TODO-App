package com.iratherfear.todo.todoapp;

import com.iratherfear.todo.todoapp.datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class HelloController {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemLongDesc;
    @FXML
    private Label itemDeadlineLabel;
    public void initialize() {
        TodoItem todoItem1 = new TodoItem("Learn Java", "Complete the Java basic, API, Spring", LocalDate.of(2024, Month.FEBRUARY, 23));
        TodoItem todoItem2 = new TodoItem("Learn Python", "Data sci, pandas, ML", LocalDate.of(2024, Month.MARCH, 1));
        TodoItem todoItem3 = new TodoItem("Learn DSA", "Basic algo, adv data structure", LocalDate.of(2024, Month.MARCH, 13));
        TodoItem todoItem4 = new TodoItem("Learn System design", "Desing basic e-com website", LocalDate.of(2024, Month.APRIL, 19));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(todoItem1);
        todoItems.add(todoItem2);
        todoItems.add(todoItem3);
        todoItems.add(todoItem4);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem oldValue, TodoItem newValue) {
                if(newValue != null) {
                    TodoItem todoItem = todoListView.getSelectionModel().getSelectedItem();
                    itemLongDesc.setText(todoItem.getLongDesc());
                    itemDeadlineLabel.setText(todoItem.getDeadline().toString());
                }
            }
        });

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

    }
}