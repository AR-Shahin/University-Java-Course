module com.example.exam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.exam to javafx.fxml;
    exports com.example.exam;
}