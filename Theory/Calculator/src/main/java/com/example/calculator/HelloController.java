package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class HelloController {

    @FXML
    private TextField age;

    @FXML
    private DatePicker dateOfBirth;

    @FXML
    private TextField email;

    @FXML
    private RadioButton gender;

    @FXML
    private CheckBox isMarried;

    @FXML
    private TextField name;

    @FXML
    private TextField phone;

    @FXML
    private Button submitBtn;

    @FXML
    private TextArea display;
    @FXML
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

    protected void clearForm(){
        name.setText("");
        email.setText("");
        phone.setText("");
        age.setText("");
        dateOfBirth.setValue(null);
    }
}