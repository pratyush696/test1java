package com.example.test1_java;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField username;
    public PasswordField password;
    public Label counter;
    @FXML
    private Label welcomeText;
    private int loginAttempts = 0;
    private boolean accountLocked = false;

    @FXML
    protected void onHelloButtonClick() {
        String enteredUsername = username.getText();
        String enteredPassword = password.getText();
        if (accountLocked) {
            welcomeText.setText("Sorry, Your Account is Locked!!!");
            return;
        }

        // Static username and password check
        if (enteredUsername.equals("Pratyush") && enteredPassword.equals("456")) {
            welcomeText.setText("Success!!!");
            loginAttempts = 0;
        } else {
            loginAttempts++;
            if (loginAttempts >= 5) {
                accountLocked = true;
                welcomeText.setText("Sorry, Your Account is Locked!!!");
            }
            welcomeText.setText("Sorry, Invalid Username or Password");
            counter.setText(String.valueOf(loginAttempts));
        }
    }




}
