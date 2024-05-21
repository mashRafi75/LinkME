package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;


public class DBUtils {
    public static void changeScene(ActionEvent event , String fxmlFile , String username , String pass) {
        Parent root=null;
        if(username!=null  && pass!=null){
            try {
                FXMLLoader loader= new FXMLLoader(DBUtils.class.getResource(fxmlFile));
                root= loader.load();
                FrontPage secondPage= loader.getController();
                //secondPage.setUsername(username);
            }catch (IOException e){
                e.printStackTrace();
            }
        }else{
            try {
                root= new FXMLLoader(DBUtils.class.getResource(fxmlFile)).load();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        Stage stage= (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
        stage.show();
    }

    public static void signupUser(ActionEvent event, String Username, String mailphone,String dateofbirth, String pass, String conpass, String gender){
        Connection connection=null;
        PreparedStatement psInsert=null;
        PreparedStatement pscheckuserExist=null;
        ResultSet resultset=null;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/project-aoop", "root", "toor");
            pscheckuserExist = connection.prepareStatement("SELECT * FROM userinfo WHERE username=?");
            pscheckuserExist.setString(1,Username);
            resultset= pscheckuserExist.executeQuery();

            if(resultset.isBeforeFirst()){
                System.out.println("USer Already Exist");
                Alert alert =new Alert(Alert.AlertType.ERROR);
                alert.setContentText("You Can Not Use This Username");
                alert.show();
            }else{
                psInsert = connection.prepareStatement("INSERT INTO userinfo (username, mailphone, dateofbirth, pass,conpass,gender) VALUES (?, ?, ?, ?, ?, ?) ");
                psInsert.setString(1,Username);
                psInsert.setString(2,mailphone);
                psInsert.setString(3,dateofbirth);
                psInsert.setString(4,pass);
                psInsert.setString(5,conpass);
                psInsert.setString(6,gender);
                psInsert.executeUpdate();

                changeScene(event, "FrontPage.fxml", Username,pass);
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (resultset!=null){
                try{
                    resultset.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (pscheckuserExist!=null){
                try{
                    pscheckuserExist.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (psInsert!=null){
                try{
                    psInsert.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }
    }

    public static void loginUser(ActionEvent event, String username, String pass){
        Connection connection=null;
        PreparedStatement preparedStatement=null;
        ResultSet resultset=null;

        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/project-aoop", "root", "toor");
            preparedStatement = connection.prepareStatement("SELECT pass FROM userinfo WHERE username=?");
            preparedStatement.setString(1,username);
            resultset= preparedStatement.executeQuery();

            if(!resultset.isBeforeFirst()){
                System.out.println("User not Found");
                Alert alert= new Alert(Alert.AlertType.ERROR);
                alert.setContentText("Provided Credentials are Incorrect");
                alert.show();
            }else{
                while (resultset.next()){
                    String retrievedPassword= resultset.getString("pass");
                    if(retrievedPassword.equals(pass)){
                        changeScene(event, "FrontPage.fxml", username, retrievedPassword);
                    }else {
                        System.out.println("Passwords did not match");
                        Alert alert= new Alert(Alert.AlertType.ERROR);
                        alert.setContentText("Provided Credentials are Incorrect");
                        alert.show();
                    }
                }
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            if (resultset!=null){
                try{
                    resultset.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (preparedStatement!=null){
                try{
                    preparedStatement.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
            if (connection!=null){
                try{
                    connection.close();
                }catch (SQLException e){
                    e.printStackTrace();
                }
            }
        }

    }



}
