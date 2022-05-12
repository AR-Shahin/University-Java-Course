package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    private TextField age;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField email;


    @FXML
    public CheckBox isMarried;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private Button submitBtn;

    @FXML
    private TextArea display;

    @FXML
    private RadioButton female;

    @FXML
    private ToggleGroup gender;

    @FXML
    private RadioButton male;

    private String genderData;

    protected void setGenderData(){
        if(gender.getSelectedToggle().equals(male)){
            this.genderData = "Male";
        }else{
            this.genderData = "Female";
        }
    }

    private String getGenderData(){
        return this.genderData;
    }
    void handleSubmitButton(ActionEvent event) {
        print("Name : " + name.getText());
        print("Email : " + email.getText());
        print("Phone : " + phone.getText());
        print("Age : " + age.getText());
        print("Date of Birth : " + dateOfBirth.getValue());
        this.displayData();
        this.clearForm();
//        print("Gender : " + gender.getText());
//        print("Is Married : " + isMarried.getText());
    }

    protected void print(Object obj){
        System.out.println(obj);
    }

    protected void displayData(){
        String data = "Name : " + name.getText() + "\n" + "Email : " + email.getText() + "\n" + "Phone : " + phone.getText() + "\n" + "Age : " + age.getText() + "\n" +"Date of Birth : " + dateOfBirth.getValue() ;
        display.setText(data);
    }

    protected String getFormData(){
        this.setGenderData();
        String chk = this.isMarried.isSelected() ? "Married" : "Bachelor";
        return "Name : " + name.getText() + "\n" + "Email : " + email.getText() + "\n" + "Phone : " + phone.getText() + "\n" + "Age : " + age.getText() + "\n" +"Date of Birth : " + dateOfBirth.getValue() + "\n" +"Gender : " + this.getGenderData() + "\n" +"Married : " + chk ;
    }
    protected void clearForm(){
        name.setText("");
        email.setText("");
        phone.setText("");
        age.setText("");
        dateOfBirth.setValue(null);
    }

    @FXML
    void changeStage(ActionEvent event) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("another.fxml"));
        Parent root = (Parent) fxmlLoader.load();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.show();
    }

    @FXML
    public void changeScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("another.fxml"));
        Parent root = loader.load();

        AnotherPageController anotherPage = loader.getController();

        anotherPage.displayData(this.getFormData());
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setTitle("Another Page");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}