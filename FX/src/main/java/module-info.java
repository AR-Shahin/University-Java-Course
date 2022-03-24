module com.example.firstapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstapp to javafx.fxml;
    exports com.example.firstapp;
}