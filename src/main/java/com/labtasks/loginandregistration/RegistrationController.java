package com.labtasks.loginandregistration;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;

public class RegistrationController {

    @FXML
    private TextField FirstNameTextField;

    @FXML
    private TextField LastNameTextField;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordTextField;

    @FXML
    private PasswordField confirmPasswordTextField;

    @FXML
    private Button SubmitButton;


    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    @FXML
    public void SubmitButtonAction()
    {
        if (FirstNameTextField.getText().isEmpty() || LastNameTextField.getText().isEmpty() || usernameTextField.getText().isEmpty() || passwordTextField.getText().isEmpty() || confirmPasswordTextField.getText().isEmpty())
        {
            showAlert(Alert.AlertType.ERROR, "Error", "Incomplete Credentials", "Please enter complete credentials");
        } else if (!passwordTextField.getText().equals(confirmPasswordTextField.getText()))
        {
            showAlert(Alert.AlertType.ERROR, "Error", "Password Mismatch", "Passwords do not match");
        } else
        {
            showAlert(Alert.AlertType.INFORMATION, "Success", "Registration Successful!", "Congratulations! Your registration was successful.");
        }
    }

    private void showAlert(Alert.AlertType type, String title, String header, String content)
    {
        Alert alert = new Alert(type);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(content);
        clearButtonAction();
        alert.showAndWait();
    }

    @FXML
    public void clearButtonAction()
    {
        FirstNameTextField.clear();
        LastNameTextField.clear();
        usernameTextField.clear();
        passwordTextField.clear();
        confirmPasswordTextField.clear();
    }

}
