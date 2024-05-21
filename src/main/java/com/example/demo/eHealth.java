package com.example.demo;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class eHealth {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView back;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

    @FXML
    private AnchorPane next;

    @FXML
    private Button next1;

    @FXML
    private Button next2;

    @FXML
    private Button next3;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private Label team1;

    @FXML
    private Label welcome;

    @FXML
    void back(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void next(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hospital_1.fxml"));
        Stage window = (Stage) next.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert next != null : "fx:id=\"next\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert next1 != null : "fx:id=\"next1\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert next2 != null : "fx:id=\"next2\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert next3 != null : "fx:id=\"next3\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'eHealth.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'eHealth.fxml'.";

    }
}

