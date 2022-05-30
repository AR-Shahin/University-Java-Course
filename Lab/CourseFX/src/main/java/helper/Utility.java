package helper;


import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Utility{
    @FXML
    public void changeScene(Event event, String path, String title) throws IOException {
        FXMLLoader loader=new FXMLLoader();
        Stage stage=(Stage)((Node)event.getSource()).getScene().getWindow();
        Parent root = loader.load(getClass().getResource(path).openStream());

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle(title);
        stage.show();
    }
}
