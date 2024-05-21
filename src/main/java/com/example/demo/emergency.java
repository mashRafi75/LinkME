package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class emergency {

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
    void callAmbulance(ActionEvent event) throws Exception {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Your request has been received by the authority");
        alert.show();

        String recipient = "moushummomin51@gmail.com";
        String subject = "Mail from team trio-bot!";
        String message = "Hello Mashrafi.eeklkjke This Is TeamTrioBot";
        EmailSender.sendEmail(recipient, subject, message,null);

    }

    @FXML
    void callFirestation(ActionEvent event) throws Exception {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Your request has been received by the authority");
        alert.show();


        String recipient = "moushummomin51@gmail.com";
        String subject = "Mail from team trio-bot!";
        String message = "Hello Mashrafi.eeklkjke This Is TeamTrioBot";
        EmailSender.sendEmail(recipient, subject, message,null);
    }

    @FXML
    void callPolice(ActionEvent event) throws Exception {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Your request has been received by the authority");
        alert.show();

        String recipient = "mhossain221240@bscse.uiu.ac.bd";
        String subject = "Mail from team trio-bot!";
        String message = "Hello Mashrafi.eeklkjke This Is TeamTrioBot";
        EmailSender.sendEmail(recipient, subject, message,null);

    }
    @FXML
    void back(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'emergency.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'emergency.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'emergency.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'emergency.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'emergency.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'emergency.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'emergency.fxml'.";

    }

}
