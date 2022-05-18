package app;

import interfaces.HasData;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Application extends javafx.application.Application {
    private String info;



    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("login.fxml"));
        javafx.scene.Scene scene = new javafx.scene.Scene(fxmlLoader.load());
        stage.setTitle("Login");
        stage.setScene(scene);
        stage.show();
    }

    public void changeScreen(Event evt, String path, String title, boolean hasData,String data) throws Exception
    {
        path = path + ".fxml";
        FXMLLoader loader=new FXMLLoader();
        Stage stage=(Stage)((Node)evt.getSource()).getScene().getWindow();
        Parent root = loader.load(getClass().getResource(path).openStream());
            if(hasData){
                HasData dataObj =(HasData) loader.getController();
                dataObj.sendData(data);
            }
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();

    }

    public void startApp()
    {
        launch();
    }
}
