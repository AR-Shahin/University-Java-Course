package com.example.coursefx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea display;
    @FXML
    private Label title;

    @FXML
    private TextField nameField,emailField,phoneField;
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }


    @FXML
    void handleSubmitButton(ActionEvent event) {
        String name = nameField.getText();
        String email = emailField.getText();
        String phone = phoneField.getText();

        String format = "Name : " + name + "\nEmail : " + email + "\nPhone : " + phone;
        display.setText(format);

        this.clearForm();
        System.out.println(name + email + phone);
    }

    private void clearForm(){
        nameField.setText("");
        emailField.setText("");
        phoneField.setText("");
    }

    @FXML
    public void handleClickMeButton(ActionEvent event) {
        title.setText("I am changed by clicking button!");
        String data = title.getText();
        System.out.println("Hello World");
        try {
            this.start();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void start() throws IOException {
        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}