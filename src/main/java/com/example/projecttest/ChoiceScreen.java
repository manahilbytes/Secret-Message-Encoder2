package com.example.projecttest;

import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;


public class ChoiceScreen {
    private VBox view = new VBox(20);
    public ChoiceScreen(EncoderApp app) {
        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: beige ");

        Label choice = new Label("Select Encryption Mode:");
        choice.setFont(Font.font("Arial",FontWeight.BOLD,20));
        choice.setTextFill(Color.GOLD);
        Button enc = new Button(" Secret Characters");
        Button enc2 = new Button(" Morse code(only Lowercase letters )");

        enc.setOnAction(e -> {
                app.currentProcessor= app.manager1;
              app.showEncrypt();
        });

        enc2.setOnAction(e -> {
               app.currentProcessor= app.manager2;
             app.showEncrypt();

        });

        view.getChildren().addAll(choice,enc, enc2);
    }
    public Parent getView() {
        return view;
    }
}