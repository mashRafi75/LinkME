module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;
    //requires javax.mail.api;
    //requires jakarta.mail;
    requires commons.email;


    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
}