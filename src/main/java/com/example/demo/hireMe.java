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

public class hireMe {

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
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private Label team1;

    @FXML
    private Label welcome;
    @FXML
    private Button job1;

    @FXML
    private Button job2;

    @FXML
    private Button job3;
    @FXML
    void back(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }


    @FXML
    void job1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("job1.fxml"));
        Stage window = (Stage) job1.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }



    @FXML
    void job2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("job2.fxml"));
        Stage window = (Stage) job2.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }



    @FXML
    void job3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("job3.fxml"));
        Stage window = (Stage) job3.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }











    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'hireMe.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'hireMe.fxml'.";

    }

}
