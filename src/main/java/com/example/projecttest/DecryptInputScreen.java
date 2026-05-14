package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class DecryptInputScreen {
    public VBox view = new VBox(15);
    public DecryptInputScreen(EncoderApp app) {
        view.setAlignment(Pos.CENTER);
        Label instruction = new Label("Verify your password to decrypt the message");

        PasswordField passVerify = new PasswordField();
        passVerify.setPromptText("Enter password...");
        passVerify.setMaxWidth(200);

        Button decryptBtn = new Button("Verify & Decrypt");

        decryptBtn.setOnAction(e -> {

            if (app.passwordMgr.verifyPassword(passVerify.getText())) {
                DecryptionScreen screen = new DecryptionScreen(app);
                app.showDecryptionScreen();

            } else {
                instruction.setText("ACCESS DENIED: INCORRECT PASSWORD");
                instruction.setTextFill(javafx.scene.paint.Color.RED);
            }
        });
        view.getChildren().addAll(new Label("STEP 2: DECRYPTION"), instruction, passVerify, decryptBtn);
    }
    public VBox getView() {
        return view;
    }
}