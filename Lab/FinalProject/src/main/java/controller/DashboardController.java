package controller;

import app.Application;
import interfaces.HasData;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import model.User;

import java.net.URL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DashboardController implements HasData, Initializable {
    private Application app;
    private User user;

    public DashboardController(){
        this.app = new Application();
        this.user = new User();
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

    public void setDonorsData(String data) {
        this.donorsData.setText(data);
    }

    @FXML
    private TextArea donorsData;
    @FXML
    private TextField searchDonor;
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
    public void goToDonorScene(ActionEvent event) throws SQLException {
        donorPane.setVisible(true);
        homePane.setVisible(false);
        ResultSet result = this.user.allDonor();
        this.modifyDataToDisplay(result);
    }

    protected void modifyDataToDisplay(ResultSet result) throws SQLException {
        String data = "\n\t\tNot Found....";

        if(result.next()){
            data = "";
            data = "Name\t\tEmail\t\tAge\t\tPhone\t\tBlood\n";
            while (result.next()){
                data += result.getString(2) + "\t"
                        + result.getString(3)+ "\t"
                        + result.getString(5)+ "\t"
                        + result.getString(6)+ "\t"
                        + result.getString(7)+ "\n"
                ;
//                System.out.println(result.getString(2));
            }
            this.setDonorsData(data);
        }else {
            this.setDonorsData(data);
        }
    }
    @FXML
    public void goToHomeScene(ActionEvent event){
        donorPane.setVisible(false);
        homePane.setVisible(true);
    }

    @FXML
    void handleDonorClearOperation(ActionEvent event) throws SQLException {
        this.searchDonor.setText("");
        ResultSet result = this.user.allDonor();
        this.modifyDataToDisplay(result);
    }

    @FXML
    void handleDonorSearchOperation(ActionEvent event) throws SQLException {
        ResultSet result = this.user.searchDonor(searchDonor.getText());
        this.modifyDataToDisplay(result);
    }
}
