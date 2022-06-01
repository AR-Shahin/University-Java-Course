package Utility;

import interefaces.HasData;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Helper {

    public void changeScreen(Event evt, String path, String title, boolean hasData, String data) throws Exception
    {
        path = path + ".fxml";
        FXMLLoader loader = new FXMLLoader();
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
}
