package com.example.exam;

import Utility.MYSQLOperation;
import interefaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.SQLException;

public class AnotherController extends MYSQLOperation implements HasData {
    public AnotherController(){
        this.connect();
    }
    @FXML
    private TextField celsius,idField;

    @FXML
    private TextArea display;
    private float Rankine,Kelvin,F,cal;
    @FXML
    void handleAnalysisOperation(ActionEvent event) throws SQLException {
        cal = Float.parseFloat(this.celsius.getText());
        this.display.setText(this.calculate(cal));
        this.insert();

    }
    private String calculate(Float celsius){
        String data = "Input\nCelsius : ";

         Rankine = (float) ((cal + 273.15) * 1.8);
         Kelvin  = (float) (cal + 273.15);
         F = (float) (((9/5.0) * cal) + 32);
        data += cal + " C\n"
                + "Output \n"
                + "Kelvin: " + Kelvin + " K\n"
                + "Fahrenheit: " + F + " F\n"
                + "Rankine: " + Rankine + " R";

        return data;
    }
    private String user;
    public void sendData(String data){
        this.user = data;
        print(this.user);
    }

    public boolean insert() throws SQLException {
        float id = Float.parseFloat(this.idField.getText());
        String query = "INSERT INTO `RecordTable` (`id`,`RecId`, `Celsius`, `Kelvin`, `Fahrenheit`, `Rankine`) VALUES (?,? ,? ,?,?,?)";
//        print(query);
//        return  false;
        statement = con.prepareStatement(query);
        statement.setInt(1,this.generateRandomNumber());
        statement.setFloat(2,id);
        statement.setFloat(3,cal);
        statement.setFloat(4,Kelvin);
        statement.setFloat(5,F);
        statement.setFloat(6,Rankine);

        if(!statement.execute()){
            return true;
        }else {
            return false;
        }
    }

    public int generateRandomNumber(){
        return 1 + (int)(Math.random() * 100);
    }
}
