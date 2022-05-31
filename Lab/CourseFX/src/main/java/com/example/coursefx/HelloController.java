package com.example.coursefx;

import helper.Utility;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController extends Utility{
    Utility utility;
    public HelloController(){
        this.utility = new Utility();
    }
    @FXML
    private AnchorPane mainPane;
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea display;
    @FXML
    private Label title;

    @FXML
    private TextField nameField,emailField,phoneField,inputField;
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

    @FXML
    void changeWindow(ActionEvent event) throws IOException {

        Stage stage = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("new-window.fxml"));

        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("New Window");

        stage.setScene(scene);

        stage.show();
    }

    public void test(Event evt, String path, String title, boolean hasData, String data) throws Exception
    {
        path = path + ".fxml";
        FXMLLoader loader=new FXMLLoader();
        Stage stage=(Stage)((Node)evt.getSource()).getScene().getWindow();
        Parent root = loader.load(getClass().getResource(path).openStream());
//        if(hasData){
//            HasData dataObj =(HasData) loader.getController();
//            dataObj.sendData(data);
//        }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();

    }

    @FXML
    void handleAnalysisButton(ActionEvent event) throws IOException {
        String data = inputField.getText();
     changeScene(event,"another.fxml");
//        utility.changeScene(event,"another.fxml","D");
//        FXMLLoader loader = new FXMLLoader();
//        Stage stage = (Stage)( (Node) event.getSource()).getScene().getWindow();
//        Parent root = loader.load(getClass().getResource("another.fxml").openStream());
//        AnotherController an = (AnotherController) loader.getController();
//        an.setData(data);
//        Scene scene = new Scene(root);
//        stage.setTitle("Another Page");
//        stage.setScene(scene);
//        stage.show();
    }

    public void fuck(Event event,String path){
        FXMLLoader loader = new FXMLLoader();
        Stage stage = (Stage)( (Node) event.getSource()).getScene().getWindow();
        Parent root = null;
        try {
            root = loader.load(getClass().getResource(path).openStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(root);
        stage.setTitle("Another Page");
        stage.setScene(scene);
        stage.show();
    }

}