package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class hospital_2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button app1;

    @FXML
    private Button app2;

    @FXML
    private Button app3;

    @FXML
    private ImageView back;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

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
        Parent root = FXMLLoader.load(getClass().getResource("hospital_1.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }


    @FXML
    void getAppointment(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert app1 != null : "fx:id=\"app1\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert app2 != null : "fx:id=\"app2\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert app3 != null : "fx:id=\"app3\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'hospital_2.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'hospital_2.fxml'.";

    }

}
