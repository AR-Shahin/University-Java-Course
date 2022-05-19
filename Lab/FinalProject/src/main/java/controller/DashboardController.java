package controller;

import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardController implements HasData, Initializable {
    private Application app;

    public DashboardController(){
        this.app = new Application();
    }
    protected String data;
    @FXML
    private TextArea display;

    @FXML
    private Pane donorPane;

    @FXML
    private Pane homePane;

    @FXML
    private Pane leftbarPane;

    @Override
    public void sendData(String data){
        this.data = data;
        display.setText(this.modifyDataToDisplay());
    }

    public String modifyDataToDisplay(){
        String temp = "";

        temp = "Name : " + data.split(";")[0] + "\n"
                + "Email : " + data.split(";")[1] + "\n"
                + "Age : " + data.split(";")[2] + "\n"
                + "Phone : " + data.split(";")[3] + "\n"
                + "Blood Group : " + data.split(";")[4] + "\n"
                + "Status : " + data.split(";")[5] + "\n"
                + "Role : " + data.split(";")[6] + "\n";

        return temp;
    }
    public void initialize(URL url, ResourceBundle resourceBundle){
        donorPane.setVisible(false);
    }

    @FXML
    void handleLogout(ActionEvent event) throws Exception {
        this.app.changeScreen(event,"login","Login",false,"");
    }

    @FXML
    public void goToDonorScene(ActionEvent event){
        donorPane.setVisible(true);
        homePane.setVisible(false);
    }

    @FXML
    public void goToHomeScene(ActionEvent event){
        donorPane.setVisible(false);
        homePane.setVisible(true);
    }
}
