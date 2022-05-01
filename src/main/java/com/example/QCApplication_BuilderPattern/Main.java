package com.example.QCApplication_BuilderPattern;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    //driver code
    @Override

    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Non-degree application");
        stage.setScene(scene);
        stage.show();
        stage.setResizable(false);
    }

    public static void main(String[] args) {
        launch();
    }
}