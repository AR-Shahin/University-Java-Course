package controller;

import app.Application;
import database.MySQLDBOperation;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.User;

public class LoginController {
    private Application app;
    private User user;
    public LoginController(){
         this.app = new Application();
         this.user = new User();

    }
    @FXML
    private TextField email;

    @FXML
    private TextField password;

    public void setNotification(String notification) {
        this.notification.setText(notification);
    }

    @FXML
    private Label notification;
    @FXML
    void handleLogin(ActionEvent event) throws Exception {

        this.user.email = email.getText();
        this.user.password = password.getText();
        String result = this.user.authenticate();
        if(result.equals("NOT_EXIST")){
            setNotification("User doesn't exists!!");
        }else {
            String role = result.split(";")[6];
//            print(role);
            if(role.equals("admin")){
                this.app.changeScreen(event,"dashboard","Dashboard",true,result);
            } else if (role.equals("donor")) {
                this.app.changeScreen(event,"donor_dashboard","Donor dashboard",true,result);
            }
//            setNotification(role);
        }

    }

    @FXML
    public void openDonorRegistrationScene(ActionEvent event) throws Exception{
        this.app.changeScreen(event,"registration","Registration",true,"Regis");
    }
    public void print(Object obj){

        System.out.println(obj);
    }

    @FXML
    public void dash(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"donor_dashboard","Donor dashboard",false,"");
    }
}
