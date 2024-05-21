package com.example.demo;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class HelloController {

    @FXML
    private Button bt1;

    @FXML
    private Button bt2;

    @FXML
    private TextField confirmPassTf;

    @FXML
    private Hyperlink forgot;

    @FXML
    private TextField fullNameTf;

    @FXML
    private ImageView image1;

    @FXML
    private ImageView image2;

    @FXML
    private Button logInBtn;

    @FXML
    private ImageView logo1;

    @FXML
    private ImageView logo2;

    @FXML
    private TextField mailTf;

    @FXML
    private TextField mailTf1;



    @FXML
    private TextField passTf;

    @FXML
    private TextField passTf1;

    @FXML
    private RadioButton radioFemale;

    @FXML
    private RadioButton radioMale;

    @FXML
    private RadioButton radioOthers;

    @FXML
    private Button signUpBtn;

    @FXML
    private Label team1;

    @FXML
    private Label team2;

    @FXML
    private Label welcome;


    @FXML
     DatePicker date;
    @FXML
    private ToggleGroup tg;


    @FXML
    void confirmPassTf(ActionEvent event) {

    }

    @FXML
    void ddTf(ActionEvent event) {

    }

    @FXML
    void forgotBtn(ActionEvent event) {

    }

    @FXML
    void frontSignup(ActionEvent event) {

        TranslateTransition tt1 = new TranslateTransition();
        tt1.setDuration(Duration.seconds(0.7));
        tt1.setNode(image1);
        tt1.setToX(500);
        tt1.play();
        image2.setTranslateX(-250);



        welcome.setVisible(false);
        mailTf.setVisible(false);
        passTf.setVisible(false);
        logInBtn.setVisible(false);
        forgot.setVisible(false);
        team1.setVisible(false);
        logo1.setVisible(false);
        bt2.setVisible(false);

        bt1.setVisible(true);
        logo2.setVisible(true);
        team2.setVisible(true);
        signUpBtn.setVisible(true);
        fullNameTf.setVisible(true);
        mailTf1.setVisible(true);
        passTf1.setVisible(true);
        confirmPassTf.setVisible(true);
        date.setVisible(true);
        radioFemale.setVisible(true);
        radioMale.setVisible(true);
        radioOthers.setVisible(true);

    }

    @FXML
    void frontlogin(ActionEvent event) {
        TranslateTransition tt1 = new TranslateTransition();
        tt1.setDuration(Duration.seconds(0.7));
        tt1.setNode(image1);
        tt1.setToX(0);
        tt1.play();
        image2.setTranslateX(0);

        welcome.setVisible(true);
        mailTf.setVisible(true);
        passTf.setVisible(true);
        logInBtn.setVisible(true);
        forgot.setVisible(true);
        team1.setVisible(true);
        logo1.setVisible(true);
        bt2.setVisible(true);

        bt1.setVisible(false);
        logo2.setVisible(false);
        team2.setVisible(false);
        signUpBtn.setVisible(false);
        fullNameTf.setVisible(false);
        mailTf1.setVisible(false);
        passTf1.setVisible(false);
        confirmPassTf.setVisible(false);
        date.setVisible(false);
        radioFemale.setVisible(false);
        radioMale.setVisible(false);
        radioOthers.setVisible(false);

    }

    @FXML
    void fullNameTf(ActionEvent event) {

    }

    @FXML
    void logInBtn(ActionEvent event) {
        DBUtils.loginUser(event, mailTf.getText(), passTf.getText());

    }

    @FXML
    void mailTf(ActionEvent event) {

    }

    @FXML
    void mmTf(ActionEvent event) {

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

        String tgname= ((RadioButton) tg.getSelectedToggle()).getText();

        if(!fullNameTf.getText().trim().isEmpty() && !passTf1.getText().trim().isEmpty()) {
            DBUtils.signupUser(event, fullNameTf.getText(),  mailTf1.getText(),  date.getEditor().getText(),passTf1.getText(),confirmPassTf.getText(), tgname);
        } else {
            System.out.println("Fill All the Info");
            Alert alert= new Alert(Alert.AlertType.ERROR);
            alert.setContentText("Fill All the Info");
            alert.show();
        }
    }

    @FXML
    void yyTf(ActionEvent event) {

    }


}
