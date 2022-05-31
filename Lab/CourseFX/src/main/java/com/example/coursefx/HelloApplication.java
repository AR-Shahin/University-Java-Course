package com.example.coursefx;

import javafx.application.Application;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("root.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    } public void changeScene(Event event, String path) throws IOException {
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