package com.example.demo;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.URL;
import java.util.ResourceBundle;

public class chat implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane ap_main;

    @FXML
    private ImageView back;

    @FXML
    private Button button_send;

    @FXML
    private ImageView image2;

    @FXML
    private ImageView logo1;

    @FXML
    private ImageView pic1;

    @FXML
    private ImageView pic2;

    @FXML
    private ScrollPane sp_main;

    @FXML
    private Label team1;

    @FXML
    private TextField tf_messege;

    @FXML
    private VBox vbox_messege;

    @FXML
    private Label welcome;

    private Server server ;

    @FXML
    void back1(MouseEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("FrontPage.fxml"));
        Stage window = (Stage) back.getScene().getWindow();
        window.setScene(new Scene(root,750,500));
        //server.closeEverything(socket, bufferedWriter, bufferedReader);

    }

    @FXML
    void initialize() {
        assert back != null : "fx:id=\"back\" was not injected: check your FXML file 'chat.fxml'.";
        assert image2 != null : "fx:id=\"image2\" was not injected: check your FXML file 'chat.fxml'.";
        assert logo1 != null : "fx:id=\"logo1\" was not injected: check your FXML file 'chat.fxml'.";
        assert pic1 != null : "fx:id=\"pic1\" was not injected: check your FXML file 'chat.fxml'.";
        assert pic2 != null : "fx:id=\"pic2\" was not injected: check your FXML file 'chat.fxml'.";
        assert team1 != null : "fx:id=\"team1\" was not injected: check your FXML file 'chat.fxml'.";
        assert welcome != null : "fx:id=\"welcome\" was not injected: check your FXML file 'chat.fxml'.";

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        try {
                server= new Server(new ServerSocket(1234));
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Error Creating Server");
        }
        vbox_messege.heightProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number oldValue, Number newValue) {
                sp_main.setVvalue((Double) newValue);
            }
        });

        server.receiveMessageFromClient(vbox_messege);

        button_send.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String messageToSend = tf_messege.getText();
                if(!messageToSend.isEmpty()){
                    HBox hbox = new HBox();
                    hbox.setAlignment(Pos.CENTER_RIGHT);
                    hbox.setPadding(new Insets(5,5,5,10));

                    Text text = new Text(messageToSend);
                    TextFlow textflow = new TextFlow(text);
                    textflow.setStyle("-fx-color: rgb(239, 242, 255);"
                    +"-fx-background-color: rgb(15,125,242);"
                    +"-fx-background-radius: 20px;");
                    textflow.setPadding(new Insets(5,10,5,10));
                    text.setFill(Color.color(0.934,0.945,0.996));

                    hbox.getChildren().add(textflow);
                    vbox_messege.getChildren().add(hbox);

                    server.sendMessageToClient(messageToSend);
                    tf_messege.clear();
                }
            }
        });
    }

    public static void addLabel(String messageFromClient, VBox vbox) {
        HBox hbox = new HBox();
        hbox.setAlignment(Pos.CENTER_LEFT);
        hbox.setPadding(new Insets(5,5,5,10));
        Text text = new Text(messageFromClient);
        TextFlow textFlow= new TextFlow(text);
        textFlow.setStyle("-fx-background-color: rgb(233,233,235);"
                            +"-fx-background-radius: 20px;");
        textFlow.setPadding(new Insets(5,10,5,10));
        hbox.getChildren().add(textFlow);

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                vbox.getChildren().add(hbox);
            }
        });
    }
}
