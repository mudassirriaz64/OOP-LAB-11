package com.labtasks.loginandregistration;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MAIN extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load login page
        FXMLLoader loginLoader = new FXMLLoader(getClass().getResource("loginpage.fxml"));
        Parent loginRoot = loginLoader.load();
        LoginController loginController = loginLoader.getController();
        loginController.setStage(primaryStage); // Set the stage for the login controller

        // Load register page
        FXMLLoader registerLoader = new FXMLLoader(getClass().getResource("registerpage.fxml"));
        Parent registerRoot = registerLoader.load();
        RegistrationController registrationController = registerLoader.getController();
        registrationController.setStage(primaryStage); // Set the stage for the register controller

        // Show login page
        Scene loginScene = new Scene(loginRoot);
        primaryStage.setScene(loginScene);
        primaryStage.setTitle("Login Page");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
