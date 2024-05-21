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

public class pharmecy {

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
    private Hyperlink phar_location1;

    @FXML
    private Hyperlink phar_location2;

    @FXML
    private Hyperlink phar_location3;

    @FXML
    private Hyperlink phar_location4;

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
    void phar_location1(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7976897,90.4500194/QCWX%2BWHW+Unimart+Express,+Unnamed+Road,+Dhaka/@23.7976412,90.446909,17z/data=!3m1!4b1!4m17!1m7!3m6!1s0x3755c7df6bd39ef7:0xe9151adccb5d694b!2sUnimart+Express!8m2!3d23.797357!4d90.4489384!16s%2Fg%2F11j0z4b224!4m8!1m1!4e1!1m5!1m1!1s0x3755c7df6bd39ef7:0xe9151adccb5d694b!2m2!1d90.4489384!2d23.797357"));
    }

    @FXML
    void phar_location2(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7976897,90.4500194/QCXH%2BG3G+Anika+Pharmacy,+Road,+Dhaka+1212/@23.7997353,90.428571,15z/data=!3m1!4b1!4m19!1m9!4m8!1m6!1m2!1s0x3755c7d8042caf2d:0x686fa3e360361ddf!2sUIU+Permanent+Campus,+Madani+Avenue,+Dacca!2m2!1d90.44971!2d23.7978829!1m0!4m8!1m1!4e1!1m5!1m1!1s0x3755c7b75c0ff7ad:0xf002ae641e09cedb!2m2!1d90.4276826!2d23.7988405"));
    }

    @FXML
    void phar_location3(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/UIU+Permanent+Campus,+Madani+Avenue,+Dacca/Medical+Shop+Bangladesh,+Madani+Avenue,+Dhaka/@23.7990583,90.4281893,15z/data=!3m1!4b1!4m13!4m12!1m5!1m1!1s0x3755c7d8042caf2d:0x686fa3e360361ddf!2m2!1d90.44971!2d23.7978829!1m5!1m1!1s0x3755c765cd066c1d:0xa45250083555e7e8!2m2!1d90.4286741!2d23.7985817"));
    }

    @FXML
    void phar_location4(ActionEvent event) throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("https://www.google.com/maps/dir/23.7976897,90.4500194/LAZZ+PHARMA+VATARA,+2502+Madani+Ave,+Dhaka+1212/@23.798817,90.4366464,16z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x3755c73996df2e6b:0x8b3aedc1f66250a2!2m2!1d90.4335111!2d23.7984686"));
    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert fireService != null : "fx:id=\"fireService\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert hospital != null : "fx:id=\"hospital\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert phar_location1 != null : "fx:id=\"phar_location1\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert phar_location2 != null : "fx:id=\"phar_location2\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert phar_location3 != null : "fx:id=\"phar_location3\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert phar_location4 != null : "fx:id=\"phar_location4\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert pharmecy != null : "fx:id=\"pharmecy\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert policeStation != null : "fx:id=\"policeStation\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'pharmecy.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'pharmecy.fxml'.";

    }

}
