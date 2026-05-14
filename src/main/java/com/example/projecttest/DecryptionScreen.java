package com.example.projecttest;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

import java.awt.*;

public class DecryptionScreen {

    private VBox view = new VBox(20);
    public DecryptionScreen(EncoderApp app) {

        view.setAlignment(Pos.CENTER);

        String decrypted = app.currentProcessor.decrypt(
                app.currentProcessor.getResult()
        );
        Label title = new Label("DECRYPTED MESSAGE");
        VBox v = new VBox(10);
        v.getChildren().add(title);
        title.setTextFill(javafx.scene.paint.Color.ORANGE);
        title.setFont(Font.font("Arial", 20));
        javafx.scene.control.TextArea message = new TextArea(decrypted);
        message.setMaxWidth(400);
        view.setAlignment(Pos.CENTER);

        Button next = new Button("Continue");

        next.setOnAction(e -> {
            app.showExit();
        });
        view.getChildren().addAll(title, message, next);
    }

    public VBox getView() {
        return view;
    }
}

