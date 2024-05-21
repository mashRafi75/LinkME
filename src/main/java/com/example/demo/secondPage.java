package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class secondPage {

    @FXML
    private Label label;

    @FXML
    private Button logoutbtn;

    @FXML
    void logoutbtn(ActionEvent event) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        Stage window = (Stage) logoutbtn.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    public void setUsername(String username){
        label.setText(username);
    }

}
