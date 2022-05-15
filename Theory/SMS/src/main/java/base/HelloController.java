package base;

import file.FileHandling;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    private FileHandling file;

   public HelloController(){
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
    private Button addNewBtn;

    @FXML
    private Pane addNewPane;

    @FXML
    private Button searchBtn;

    @FXML
    private Pane searchPane;

   @FXML
   private TextArea searchData;

   @FXML
   private TextField searchID;
   @FXML
   private Label notification;

   private void setSearchData(String data){
       searchData.setText(data);
   }
    private String generateDataForFile(){
        String data = name.getText() + ";" + id.getText() + ";" + age.getText() + ";" + address.getText() + "\n";

        return data;
    }
    protected void clearForm(){
     name.setText("");
     id.setText("");
     address.setText("");
     age.setText("");
    }
    private void setNotification(String mgs){
     this.notification.setText(mgs);
    }

    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        addNewPane.setVisible(false);
        searchPane.setVisible(false);
    }
   @FXML
   public void showSearchPane(ActionEvent event){
       this.clearSearchWindow();
       notification.setText("");
        searchPane.setVisible(true);
        addNewPane.setVisible(false);
   }

    @FXML
    public void showAddNewPane(ActionEvent event){
        searchPane.setVisible(false);
        addNewPane.setVisible(true);
    }
    @FXML
    public void handleAddNewData(ActionEvent event){
        this.file.setDataIntoFile(this.generateDataForFile());
        this.clearForm();
        this.setNotification("Registration Successfully done!");
//        System.out.println(this.generateDataForFile());
    }


    @FXML
    public void handleSearchOperation(ActionEvent event){
        String id = searchID.getText();
        if (id == ""){
            this.setSearchData("");
        }else{
            String data = this.file.searchStudentByID(id);
            this.setSearchData(data);
        }
    }

    private void print(Object obj){
        System.out.println(obj);
    }

    @FXML
    public void clearSearchWindow(ActionEvent event){
        searchData.setText("");
        searchID.setText("");
    }
    private void clearSearchWindow(){
        searchData.setText("");
        searchID.setText("");
    }
}