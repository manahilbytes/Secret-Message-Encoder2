package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class EncryptInputScreen {
     VBox view = new VBox(10);

    public EncryptInputScreen(EncoderApp app) {
        view.setAlignment(Pos.CENTER);
        TextArea inputArea = new TextArea();
        inputArea.setPromptText("Type your message here...");
        inputArea.setMaxWidth(400);

        PasswordField passField = new PasswordField();
        passField.setPromptText("Create a password for this message");
        passField.setMaxWidth(200);
        Button encryptBtn = new Button("Encrypt");
        encryptBtn.setOnAction(e -> {
            String text = inputArea.getText();
            String password = passField.getText();

            if (!text.isEmpty() && !password.isEmpty()) {
                app.passwordMgr.setPassword(password);
                String encryptedText = app.currentProcessor.encrypt(text);
                app.currentProcessor.storeResult(encryptedText);
                app.showOutput(encryptedText);
            }
        });
        view.getChildren().addAll(new Label("STEP 1: ENCRYPTION"), inputArea, new Label("Set Password:"), passField, encryptBtn);
    }
    public VBox getView() {
        return view;
    }
}