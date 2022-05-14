package base;

import file.FileHandling;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController{

    private FileHandling file;

    HelloController(){
        this.file = new FileHandling();
    }
    @FXML
    private TextField name;

    @FXML
    private TextField id;

    @FXML
    private TextField address;

    @FXML
    private TextField age;
    @FXML
    private Label welcomeText;

    private String generateDataForFile(){
        String data = name.getText() + ";" + id.getText() + ";" + age.getText() + ";" + address.getText() + "\n";

        return data;
    }

    @FXML
    public void handleAddNewData(ActionEvent event){
        System.out.println("event");
    }


    @FXML
    public void handleSearchOperation(){

    }

}