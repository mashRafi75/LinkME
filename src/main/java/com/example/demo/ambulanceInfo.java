package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ambulanceInfo {

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
    void back1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("frontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void getAmbulance(ActionEvent event) throws EmailException {

        String recipient = "moushummomin51@gmail.com";
        String subject = "Emergency Appoinment";
        String message =
                "Dear Mr./Mrs. Ink\n" +
                        "This email confirms your that an ambulance will arrive at your place by 7pm.\n" +

                        "United Hospital LTD. \n" +
                        "100 Feet, Madani Aveneu, Dhaka 1212 \n" +
                        "Phone: 01958527208\n";
        EmailSender.sendEmail(recipient, subject, message, null);
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'ambulanceInfo.fxml'.";

    }

}
