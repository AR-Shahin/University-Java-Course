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
    public void changeScene(Event event, String path) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        Stage stage = (Stage)( (Node) event.getSource()).getScene().getWindow();
        Parent root = null;
        try {
            root = loader.load(getClass().getResource(path).openStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        Scene scene = new Scene(root);
        stage.setTitle("Another Page");
        stage.setScene(scene);
        stage.show();
    }
}
