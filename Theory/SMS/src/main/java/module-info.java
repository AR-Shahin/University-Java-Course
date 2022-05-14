module com.example.sms {
    requires javafx.controls;
    requires javafx.fxml;


    opens base to javafx.fxml;
    exports base;
}