module com.example.coursefx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coursefx to javafx.fxml;
    exports com.example.coursefx;
}