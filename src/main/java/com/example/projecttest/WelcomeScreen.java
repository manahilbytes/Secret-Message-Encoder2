package com.example.projecttest;


import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class WelcomeScreen {

    private VBox view = new VBox(20);

    public WelcomeScreen(EncoderApp app) {

        view.setAlignment(Pos.CENTER);
        view.setStyle("-fx-background-color: lightblue");

        Label title = new Label("Secret Message Encoder/ Decoder");
        title.setFont(Font.font("Arial", FontWeight.BOLD, 26));
        title.setTextFill(Color.GOLD);

        Label subTitle = new Label("Keep your messages safe!");
        subTitle.setFont(Font.font("Arial", FontWeight.BOLD, 16));
        subTitle.setTextFill(Color.LAVENDER);


        Button startBtn = new Button("Start");
        startBtn.setPrefSize(150, 40);

        startBtn.setOnAction(e -> app.showChoice());

        view.getChildren().addAll(title, subTitle, startBtn);
    }

    public Parent getView() {

        return view;
    }
}
