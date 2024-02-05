module com.iratherfear.todo.todoapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.iratherfear.todo.todoapp to javafx.fxml;
    exports com.iratherfear.todo.todoapp;
}