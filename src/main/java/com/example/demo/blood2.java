package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class blood2 {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button Send;

    @FXML
    private ImageView back;

    @FXML
    private TextField bags1;

    @FXML
    private TextField fullNameTf1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

    @FXML
    private TextField mailTf11;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private RadioButton radioFemale2;

    @FXML
    private RadioButton radioFemale26;

    @FXML
    private RadioButton radioFemale5;

    @FXML
    private RadioButton radioMale1;

    @FXML
    private RadioButton radioMale3;

    @FXML
    private RadioButton radioMale6;

    @FXML
    private RadioButton radioOthers3;

    @FXML
    private RadioButton radioOthers4;

    @FXML
    private Label team1;

    @FXML
    private ToggleGroup tg;

    @FXML
    private ToggleGroup tg1;

    @FXML
    private ToggleGroup tg2;

    @FXML
    private ToggleGroup tg3;

    @FXML
    private Label welcome;

    @FXML
    void back1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood1.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void fullNameTf1(ActionEvent event) {

    }

    @FXML
    void mailTf1(ActionEvent event) {

    }

    @FXML
    void radioFemale2(ActionEvent event) {

    }

    @FXML
    void radioFemale26(ActionEvent event) {

    }

    @FXML
    void radioFemale5(ActionEvent event) {

    }

    @FXML
    void radioMale1(ActionEvent event) {

    }

    @FXML
    void radioMale3(ActionEvent event) {

    }

    @FXML
    void radioMale6(ActionEvent event) {

    }

    @FXML
    void radioOthers3(ActionEvent event) {

    }

    @FXML
    void radioOthers4(ActionEvent event) {

    }

    @FXML
    void send(ActionEvent event) throws IOException, EmailException {
        String recipient = "moushummomin51@gmail.com";
        String subject = "Emergency Appoinment";
        String message =
                "Dear Mr./Mrs.Ink\n" +
                        "This email confirms you that 2 bags of O+ve blood will be brought to you within a few hours\n"+
                        "United Hospital LTD. \n" +
                        "100 Feet, Madani Aveneu, Dhaka 1212 \n" +
                        "Phone: 01958527208\n";
        EmailSender.sendEmail(recipient, subject, message, null);
    }

    @FXML
    void initialize() {
        assert Send != null : "fx:id=\"Send\" was not injected: check your FXML file 'blood2.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'blood2.fxml'.";
        assert bags1 != null : "fx:id=\"bags1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert fullNameTf1 != null : "fx:id=\"fullNameTf1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'blood2.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert mailTf11 != null : "fx:id=\"mailTf11\" was not injected: check your FXML file 'blood2.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioFemale2 != null : "fx:id=\"radioFemale2\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioFemale26 != null : "fx:id=\"radioFemale26\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioFemale5 != null : "fx:id=\"radioFemale5\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioMale1 != null : "fx:id=\"radioMale1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioMale3 != null : "fx:id=\"radioMale3\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioMale6 != null : "fx:id=\"radioMale6\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioOthers3 != null : "fx:id=\"radioOthers3\" was not injected: check your FXML file 'blood2.fxml'.";
        assert radioOthers4 != null : "fx:id=\"radioOthers4\" was not injected: check your FXML file 'blood2.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert tg != null : "fx:id=\"tg\" was not injected: check your FXML file 'blood2.fxml'.";
        assert tg1 != null : "fx:id=\"tg1\" was not injected: check your FXML file 'blood2.fxml'.";
        assert tg2 != null : "fx:id=\"tg2\" was not injected: check your FXML file 'blood2.fxml'.";
        assert tg3 != null : "fx:id=\"tg3\" was not injected: check your FXML file 'blood2.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'blood2.fxml'.";

    }

}

