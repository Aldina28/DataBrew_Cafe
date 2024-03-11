package com.example.cafepos;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("CAFE POS");
        stage.setMinHeight(450);
        stage.setMinWidth(620);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        HelloApplication.launch(HelloApplication.class, args);
    }
}