package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;

public class FrontPage {


    @FXML
    private Button admin;

    @FXML
    private Button b1;

    @FXML
    private Button b2;

    @FXML
    private Button b21;

    @FXML
    private Button b211;

    @FXML
    private Button b3;

    @FXML
    private Button b4;

    @FXML
    private TextField confirmPassTf;

    @FXML
    private DatePicker date;

    @FXML
    private Button emergency;

    @FXML
    private TextField fullNameTf;

    @FXML
    private ImageView icon2;

    @FXML
    private ImageView icon21;

    @FXML
    private ImageView icon211;

    @FXML
    private ImageView icon3;

    @FXML
    private ImageView icon4;

    @FXML
    private ImageView icone1;

    @FXML
    private AnchorPane image1;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

    @FXML
    private Button logout;

    @FXML
    private TextField mailTf1;

    @FXML
    private ImageView menu;

    @FXML
    private ImageView menuback;

    @FXML
    private TextField passTf1;

    @FXML
    private ImageView pic1;

    @FXML
    private Button profile;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioOthers;

    @FXML
    private Button save;

    @FXML
    private Label team1;

    @FXML
    private ToggleGroup tg;

    @FXML
    private ToggleGroup tg1;

    @FXML
    private ToggleGroup tg2;

    @FXML
    private Label welcome;

    @FXML
    void areaInfo(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("areaInfo.fxml"));
        Stage window = (Stage) b1.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void chat(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("chat.fxml"));
        Stage window = (Stage) b3.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void confirmPassTf(ActionEvent event) {

    }

    @FXML
        void eHealth(ActionEvent event) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("eHealth.fxml"));
            Stage window = (Stage) b2.getScene().getWindow();
            window.setScene(new Scene(root,750,500));
    }

    @FXML
    void emergency(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("emergency.fxml"));
        Stage window = (Stage) emergency.getScene().getWindow();
        window.setScene(new Scene(root,750,500));

    }

    @FXML
    void fullNameTf(ActionEvent event) {

    }

    @FXML
    void hireMe(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hireMe.fxml"));
        Stage window = (Stage) b4.getScene().getWindow();
        window.setScene(new Scene(root,750,500));

    }

    @FXML
    void mailTf(ActionEvent event) {

    }

    @FXML
    void menu(MouseEvent event) {


        TranslateTransition slide=new TranslateTransition();
        slide.setDuration(Duration.seconds(0.6));
        slide.setNode(image1);
        slide.setToX(0);
        slide.play();
        image1.setTranslateX(-226);


        //pic2.setVisible(true);
        image1.setVisible(true);
        save.setVisible(true);
        fullNameTf.setVisible(true);
        mailTf1.setVisible(true);
        passTf1.setVisible(true);
        confirmPassTf.setVisible(true);
        date.setVisible(true);
        radioFemale.setVisible(true);
        radioMale.setVisible(true);
        radioOthers.setVisible(true);
        menuback.setVisible(true);
        profile.setVisible(true);
        logout.setVisible(true);


        image2.setVisible(false);
        logo1.setVisible(false);
        pic1.setVisible(false);
        team1.setVisible(false);
        welcome.setVisible(false);
        emergency.setVisible(false);
        b1.setVisible(false);
        b2.setVisible(false);
        b3.setVisible(false);
        b4.setVisible(false);
        icone1.setVisible(false);
        icon2.setVisible(false);
        icon3.setVisible(false);
        icon4.setVisible(false);
        menu.setVisible(false);
        b21.setVisible(false);
        b211.setVisible(false);
        icon21.setVisible(false);
        icon211.setVisible(false);

    }

    @FXML
    void menuback(MouseEvent event) {
        TranslateTransition slide=new TranslateTransition();
        slide.setDuration(Duration.seconds(0.6));
        slide.setNode(image1);
        slide.setToX(-226);
        slide.play();
        image1.setTranslateX(0);

        image1.setVisible(false);
        save.setVisible(false);
        //signUpBtn.setVisible(false);
        fullNameTf.setVisible(false);
        mailTf1.setVisible(false);
        passTf1.setVisible(false);
        confirmPassTf.setVisible(false);
        date.setVisible(false);
        radioFemale.setVisible(false);
        radioMale.setVisible(false);
        radioOthers.setVisible(false);
        //pic2.setVisible(false);
        profile.setVisible(false);
        logout.setVisible(false);

        image2.setVisible(true);
        logo1.setVisible(true);
        image2.setVisible(true);
        pic1.setVisible(true);
        team1.setVisible(true);
        welcome.setVisible(true);
        emergency.setVisible(true);
        b1.setVisible(true);
        b2.setVisible(true);
        b3.setVisible(true);
        b4.setVisible(true);
        icone1.setVisible(true);
        icon2.setVisible(true);
        icon3.setVisible(true);
        icon4.setVisible(true);
        menu.setVisible(true);
        b21.setVisible(true);
        b211.setVisible(true);
        icon21.setVisible(true);
        icon211.setVisible(true);

    }

    @FXML
    void ambulance(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("ambulanceInfo.fxml"));
        Stage window = (Stage) b211.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }



    @FXML
    void bloodbank(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("blood1.fxml"));
        Stage window = (Stage) b21.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void passTf(ActionEvent event) {

    }

    @FXML
    void radioFemale(ActionEvent event) {

    }

    @FXML
    void radioMale(ActionEvent event) {

    }

    @FXML
    void radioOthers(ActionEvent event) {

    }

    @FXML
    void signUpBtn(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert b3 != null : "fx:id=\"b3\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert b4 != null : "fx:id=\"b4\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert confirmPassTf != null : "fx:id=\"confirmPassTf\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert date != null : "fx:id=\"date\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert emergency != null : "fx:id=\"emergency\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert fullNameTf != null : "fx:id=\"fullNameTf\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert icon2 != null : "fx:id=\"icon2\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert icon3 != null : "fx:id=\"icon3\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert icon4 != null : "fx:id=\"icon4\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert icone1 != null : "fx:id=\"icone1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert image1 != null : "fx:id=\"image1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert mailTf1 != null : "fx:id=\"mailTf1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert menu != null : "fx:id=\"menu\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert menuback != null : "fx:id=\"menuback\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert passTf1 != null : "fx:id=\"passTf1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        //assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert radioFemale != null : "fx:id=\"radioFemale\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert radioMale != null : "fx:id=\"radioMale\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert radioOthers != null : "fx:id=\"radioOthers\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert save != null : "fx:id=\"signUpBtn\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert admin != null : "fx:id=\"slidebtn\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert tg != null : "fx:id=\"tg\" was not injected: check your FXML file 'FrontPage.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'FrontPage.fxml'.";

    }

}



