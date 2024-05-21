package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class blood1 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView back;

    @FXML
    private Hyperlink bd1;

    @FXML
    private Hyperlink bd2;

    @FXML
    private Hyperlink bd3;

    @FXML
    private Hyperlink bd4;

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
    void back1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("frontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void bd1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood2.fxml"));
        Stage window = (Stage) bd1.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void bd2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood2.fxml"));
        Stage window = (Stage) bd2.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void bd3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood2.fxml"));
        Stage window = (Stage) bd3.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void bd4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood2.fxml"));
        Stage window = (Stage) bd4.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'blood1.fxml'.";
        assert bd1 != null : "fx:id=\"bd1\" was not injected: check your FXML file 'blood1.fxml'.";
        assert bd2 != null : "fx:id=\"bd2\" was not injected: check your FXML file 'blood1.fxml'.";
        assert bd3 != null : "fx:id=\"bd3\" was not injected: check your FXML file 'blood1.fxml'.";
        assert bd4 != null : "fx:id=\"bd4\" was not injected: check your FXML file 'blood1.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'blood1.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'blood1.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'blood1.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'blood1.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'blood1.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'blood1.fxml'.";

    }

}
