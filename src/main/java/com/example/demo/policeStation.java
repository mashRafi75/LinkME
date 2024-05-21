package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

public class policeStation {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView back;

    @FXML
    private Button fireService;

    @FXML
    private Button hospital;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

    @FXML
    private Button pharmecy;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private Hyperlink pol_location1;

    @FXML
    private Hyperlink pol_location2;

    @FXML
    private Hyperlink pol_location3;

    @FXML
    private Hyperlink pol_location4;

    @FXML
    private Button policeStation;

    @FXML
    private Label team1;

    @FXML
    private Label welcome;

    @FXML
    void back1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void fireService(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("fireService.fxml"));
        Stage window = (Stage) fireService.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void hospital(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("areaInfo.fxml"));
        Stage window = (Stage) hospital.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }

    @FXML
    void pharmecy(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("pharmecy.fxml"));
        Stage window = (Stage) pharmecy.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }



    @FXML
    void policeStation(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("policeStation.fxml"));
        Stage window = (Stage) policeStation.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
    }



    @FXML
    void pol_location1(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/UIU+Permanent+Campus,+Madani+Avenue,+Dacca/Vatara+Police+Station,+House+%23+2+Madani+Ave,+Dhaka+1212/@23.7988629,90.4265176,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3755c7d8042caf2d:0x686fa3e360361ddf!2m2!1d90.44971!2d23.7978829!1m5!1m1!1s0x3755c7ba8f38eb77:0xd48b94be37fa11cb!2m2!1d90.4239413!2d23.7975588"));
    }

    @FXML
    void pol_location2(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/UIU+Permanent+Campus,+Madani+Avenue,+Dacca/DNCC+Police+Box,+QCXF%2B279,+Madani+Ave,+Dhaka+1212/@23.798104,90.4261821,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3755c7d8042caf2d:0x686fa3e360361ddf!2m2!1d90.44971!2d23.7978829!1m5!1m1!1s0x3755c7ba97a5aedf:0xf1e4edf283a67b2!2m2!1d90.4232439!2d23.7975306"));
    }


    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert fireService != null : "fx:id=\"fireService\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert hospital != null : "fx:id=\"hospital\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pharmecy != null : "fx:id=\"pharmecy\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pol_location1 != null : "fx:id=\"pol_location1\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pol_location2 != null : "fx:id=\"pol_location2\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pol_location3 != null : "fx:id=\"pol_location3\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert pol_location4 != null : "fx:id=\"pol_location4\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert policeStation != null : "fx:id=\"policeStation\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'policeStation.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'policeStation.fxml'.";

    }

}
