package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.apache.commons.mail.EmailException;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class hospital_1 {

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
    private Hyperlink more;

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
        Parent root = FXMLLoader.load(getClass().getResource("eHealth.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void getAppoinment(ActionEvent event) throws EmailException {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Your CV has been received by the authority");
        alert.show();

        String recipient = "moushummomin51@gmail.com";
        String subject = "Emergency Appoinment";
        String message =
                "Dear Mr./Mrs.\n" +
                "This email confirms your that an appionment on  May 3, 2023  7:15 pm  With Dr. Anik Rahman   at United Hospital LTD.\n" +
                "Please keep the following in mind when preparing for your appointment:\n" +
                ". New patients should arrive at least 15 minutes early to fill out the required paperwork.\n" +
                ". Please remember to bring [IMPORTANT DOCUMENT].\n" +
                ". In order to ensure that all patients are seen promptly, your appointment may be rescheduled if you are more than 15 minutes late.\n" +
                " \n" +
                "To cancle or reschedule your appiontment before the scheduled time, please contact with us \n" +
                " \n" +
                "If you have any additional question, use the contact information below to get in touch with us.\n" +
                " \n" +
                "United Hospital LTD. \n" +
                "100 Feet, Madani Aveneu, Dhaka 1212 \n" +
                "Phone: 01958527208\n";
        EmailSender.sendEmail(recipient, subject, message, null);
    }

    @FXML
    void more(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hospital_2.fxml"));
        Stage window = (Stage) more.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void next(MouseEvent event) {

    }

    @FXML
    void initialize() {
        assert app1 != null : "fx:id=\"app1\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert app2 != null : "fx:id=\"app2\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert app3 != null : "fx:id=\"app3\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert more != null : "fx:id=\"more\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'hospital_1.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'hospital_1.fxml'.";

    }

}
