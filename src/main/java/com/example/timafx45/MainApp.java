package com.example.timafx45;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {
    private static final Controller CONTROLLER = new Controller();
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 310);
        stage.setTitle("Lab45!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    public static void showAlertOnMouseExited() {
        CONTROLLER.getAnchorPane().setOnMouseExited(CONTROLLER::onMouseExited);
    }
}