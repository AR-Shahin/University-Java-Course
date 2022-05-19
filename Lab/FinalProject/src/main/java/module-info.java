module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens app to javafx.fxml;
    exports app;
    exports controller;
    opens controller to javafx.fxml;
}