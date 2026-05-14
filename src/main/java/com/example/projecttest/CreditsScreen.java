package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;

public class CreditsScreen {
    private VBox view = new VBox(15);
    public CreditsScreen(EncoderApp app) {
        view.setAlignment(Pos.CENTER);
        Label header = new Label("CREDITS");
        header.setStyle("-fx-font-weight: bold; -fx-font-size: 20;");

        Label studentInfo = new Label("Developers:\nManahil Fatima(FA25-BSE-060)\nMishal Shahid(FA25-BSE-169)\nCOMSATS University Lahore");
        studentInfo.setStyle("-fx-text-alignment: center;");

        Button exitApp = new Button("Exit ");
        exitApp.setOnAction(e -> System.exit(0));

       view.getChildren().addAll(header, studentInfo, exitApp);
    }
    public VBox getView() { return view; }
}