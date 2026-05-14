package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class ExitScreen {
    private VBox view = new VBox(20);
    public ExitScreen(EncoderApp app) {
        view.setAlignment(Pos.CENTER);
        Label l = new Label("The secure session has ended.");
        Button creditsBtn = new Button("View Developers");
        creditsBtn.setOnAction(e -> app.showCredits());
        view.getChildren().addAll(l, creditsBtn);
    }
    public VBox getView() { return view; }
}