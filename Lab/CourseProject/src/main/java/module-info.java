module com.example.courseproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.courseproject to javafx.fxml;
    exports com.example.courseproject;
}