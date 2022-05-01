package com.example.QCApplication_BuilderPattern;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class LoginController {


    Map<String,String>loginDetail = new HashMap<>();
    protected static String passwordField;
    protected static String UIDField;

    Stage scene1;
    Parent root;
    FXMLLoader loader;
    Scene1Controller scene1Controller;

    @FXML
    TextField userIDInput,passwordInput;
    @FXML
    Button loginButton;

    public void loadUserList()
    {
        loginDetail.put("123","abc");
        loginDetail.put("456","xyz");
    }

    public String getUID()
    {
        return UIDField;
    }
    public void loginClick(ActionEvent actionEvent) throws IOException {

        loadUserList();

        UIDField = userIDInput.getText();
        passwordField = passwordInput.getText();

        if(loginDetail.get(UIDField)== null )
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("User not found");
            String s = "User not found";
            alert.setContentText(s);
            alert.showAndWait();
        }else if(loginDetail.get(UIDField).compareTo(passwordField) != 0)
        {
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Wrong password");
            String s = "Wrong password";
            alert.setContentText(s);
            alert.showAndWait();
        }
        else if (loginDetail.get(UIDField).equals(passwordField)) {
            userIDInput.getScene().getWindow().hide();
            scene1 = new Stage();
            loader = new FXMLLoader(getClass().getResource("scene1.fxml"));
            root = loader.load();
            scene1Controller = loader.getController();
            Scene scene = new Scene(root);
            scene1.setScene(scene);
            scene1.show();
            scene1Controller.setUID(UIDField);
        }


    }


}