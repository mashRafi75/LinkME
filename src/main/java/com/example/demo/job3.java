/**
 * Sample Skeleton for 'job1.fxml' Controller Class
 */

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

public class job3 {

    @FXML // fx:id="back"
    private ImageView back; // Value injected by FXMLLoader

    @FXML // fx:id="image2"
    private ImageView image2; // Value injected by FXMLLoader

    @FXML // fx:id="logo1"
    private ImageView logo1; // Value injected by FXMLLoader

    @FXML // fx:id="pic1"
    private ImageView pic1; // Value injected by FXMLLoader

    @FXML // fx:id="pic2"
    private ImageView pic2; // Value injected by FXMLLoader

    @FXML // fx:id="team1"
    private Label team1; // Value injected by FXMLLoader

    @FXML // fx:id="welcome"
    private Label welcome; // Value injected by FXMLLoader

    @FXML
    void back(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hireMe.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void sendCv(ActionEvent event) throws Exception {
        Alert alert =new Alert(Alert.AlertType.CONFIRMATION);
        alert.setContentText("Your CV has been received by the authority");
        alert.show();

        String recipient = "mrahman221014@bscse.uiu.ac.bd";
        String subject = "Mail from team trio-bot!";
        String message = "Summary\n" +
                "Senior Web Developer specializing in front end development. Experienced with all stages of the development cycle for dynamic web projects. Well-versed in numerous programming languages including HTML5, PHP OOP, JavaScript, CSS, MySQL. Strong background in project management and customer relations.\n" +
                "Skill Highlights\n" +
                "•\tProject management\n" +
                "•\tStrong decision maker\n" +
                "•\tComplex problem solver\t•\tCreative design\n" +
                "•\tInnovative\n" +
                "•\tService-focused\n" +
                "Experience\n" +
                "Web Developer - 09/2015 to 05/2019\n" +
                "Luna Web Design, New York\n" +
                "•\tCooperate with designers to create clean interfaces and simple, intuitive interactions and experiences.\n" +
                "•\tDevelop project concepts and maintain optimal workflow.\n" +
                "•\tWork with senior developer to manage large, complex design projects for corporate clients.\n" +
                "•\tComplete detailed programming and development tasks for front end public and internal websites as well as challenging back-end server code.\n" +
                "•\tCarry out quality assurance tests to discover errors and optimize usability.\n" +
                "Education\n" +
                "Bachelor of Science: Computer Information Systems - 2014\n" +
                "Columbia University, NY\n" +
                "Certifications\n" +
                "PHP Framework (certificate): Zend, Codeigniter, Symfony.\n" +
                "Programming Languages: JavaScript, HTML5, PHP OOP, CSS, SQL, MySQL.\n";
        String path= "C:\\Users\\Mashrafi\\OneDrive\\Desktop";
        EmailSender.sendEmail(recipient, subject, message,path);


    }
}
