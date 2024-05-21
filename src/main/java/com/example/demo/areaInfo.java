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

public class areaInfo {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView back;

    @FXML
    private Button fireService;

    @FXML
    private Hyperlink hos_location1;

    @FXML
    private Hyperlink hos_location2;

    @FXML
    private Hyperlink hos_location3;

    @FXML
    private Hyperlink hos_location4;

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
    void hos_location1(ActionEvent event) throws URISyntaxException, IOException {

        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7977766,90.4500895/United+Medical+College+and+University,+QCXW%2B5PF,+Unitred+City,+Madani+Ave/@23.7978318,90.4470122,18z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c70fa3a16789:0x182674216cda21b9!2m2!1d90.446795!2d23.797938"));


    }

    @FXML
    void hos_location2(ActionEvent event) throws URISyntaxException, IOException {

        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7977766,90.4500895/House+No%2315,+Farazy+Hospital+Ltd.,+Banasree+Main+Road,+Dacca/@23.7814764,90.4161253,14z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755b809fd8d4487:0x7c9b3001d76ccc77!2m2!1d90.436251!2d23.7625105"));

    }

    @FXML
    void hos_location3(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7977766,90.4500895/M.+Rahman+Medical+%26+Diagnostic+Center,+Dhaka/@23.7994064,90.4268581,15z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c720a48b7445:0xb2fa6034179dcc13!2m2!1d90.4260313!2d23.7982531"));
    }

    @FXML
    void hos_location4(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI(""));
    }


    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert fireService != null : "fx:id=\"fireService\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert hos_location1 != null : "fx:id=\"hos_location1\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert hos_location2 != null : "fx:id=\"hos_location2\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert hos_location3 != null : "fx:id=\"hos_location3\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert hos_location4 != null : "fx:id=\"hos_location4\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert hospital != null : "fx:id=\"hospital\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert pharmecy != null : "fx:id=\"pharmecy\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert policeStation != null : "fx:id=\"policeStation\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'areaInfo.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'areaInfo.fxml'.";

    }

}
