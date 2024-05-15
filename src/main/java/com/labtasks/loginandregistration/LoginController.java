package com.labtasks.loginandregistration;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.event.ActionEvent;

import javax.swing.*;

public class LoginController
{

    private Stage stage;
    @FXML
    private Button cance_button;
    
    @FXML
    private Button login_button;

    @FXML
    private TextField usernameTextField;

    @FXML
    private TextField passwordTextField;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public void Loginbuttonaction(ActionEvent event) {
        // Check if username and password fields are empty
        if (usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty()) {
            // Show an alert to inform the user to enter complete credentials
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Please enter complete credentials");
            alert.showAndWait();
        }
        else if(usernameTextField.getText().equals("admin") && passwordTextField.getText().equals("admin123"))
        {
            // If fields are not empty, show a message box indicating successful login
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Success");
            alert.setHeaderText(null);
            alert.setContentText("Login Successful!");
            Clearbuttonaction(event);
            alert.showAndWait();
        }
        else
        {
            // If fields are not empty, show a message box indicating successful login
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Credentials");
            alert.showAndWait();
        }
    }
    
    public void Clearbuttonaction(ActionEvent event)
    {
        this.usernameTextField.setText("");
        this.passwordTextField.setText("");

    }

    public void SignUpButtonActon(ActionEvent event) {
        try
        {
            stage.hide();
            FXMLLoader fxmlLoader = new FXMLLoader(MAIN.class.getResource("RegisterPage.fxml"));
            Stage registerstage = new Stage();
            registerstage.setTitle("Registration Page");
            registerstage.setScene(new Scene(fxmlLoader.load(), 600, 400));
            registerstage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}