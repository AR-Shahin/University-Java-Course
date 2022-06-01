package com.example.exam;

import Utility.MYSQLOperation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HelloController extends MYSQLOperation {
    private String table,query;
    @FXML
    private TextField id;
    private String userId,userPassword;
    @FXML
    private Label notification;

    @FXML
    private PasswordField password;
    @FXML
    private Label welcomeText;

    public HelloController(){
        this.connect();
    }

    @FXML
    public void handleLogin(ActionEvent event) throws Exception {
        this.userId = id.getText();
        this.userPassword = password.getText();
        if(this.userId == "" || this.userPassword == ""){
            setNotification("Field Must not be Empty!!");
        }else {
            String result = this.authenticate();
            if(result.equals("NOT_EXIST")){
                setNotification("User doesn't exists!!");
            }else {
                this.changeScreen(event,"another","Second Page",true,result);

            }
        }

    }

    public void setNotification(String notification) {
        this.notification.setText(notification);
    }

    public String authenticate() throws SQLException {
        String user = "NOT_EXIST";
        this.table = "userTable";
        this.query = "SELECT * FROM `"+ table +"` WHERE userID = '"+ this.userId +"' AND password = '" + this.userPassword +"' LIMIT 1";
        this.statement = this.con.prepareStatement(query);
        ResultSet data = statement.executeQuery();

        if(data.next()){
            user =data.getString(1) + ";" + data.getString(2) + ";" + data.getString(3);
//            print(user);
        }
        return user;
    }
}