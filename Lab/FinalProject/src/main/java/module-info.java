module com.example.finalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens app to javafx.fxml;
    exports app;
    exports controller;
    opens controller to javafx.fxml;
}