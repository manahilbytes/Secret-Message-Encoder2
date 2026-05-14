package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class OutputScreen {
    private VBox view = new VBox(15);

    public OutputScreen(EncoderApp app, String result) {
        view.setAlignment(Pos.CENTER);
        Label title = new Label("ENCRYPTION COMPLETE");

        TextArea output = new TextArea(result);
        output.setEditable(false);
        output.setMaxWidth(400);

        Button nextBtn = new Button("Move to Decryption Stage");
        nextBtn.setOnAction(e -> app.showDecrypt());

        view.getChildren().addAll(title, new Label("Your Encrypted Text:"), output, nextBtn);
    }
    public VBox getView() {
        return view;
    }
}