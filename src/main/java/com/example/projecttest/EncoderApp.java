package com.example.projecttest;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

 //               ************************************************
 //               *        MANAHIL FATIMA(FA25-BSE-060)          *
//                *        MISHAL SHAHID(FA25-BSE169)            *
//                ************************************************
public class EncoderApp extends Application {
    private Stage primaryStage;
    EncryptionLogic manager1;
    EncryptionLogic manager2;
    EncryptionLogic currentProcessor;

    public PasswordManager passwordMgr = new PasswordManager();

    public void start(Stage stage) {
        manager1= new ProcessingManager();
        manager2 = new Processor2();
        this.primaryStage = stage;
        showWelcome();
        stage.setTitle("Secret Encoder");
        stage.show();
    }
     public void setScene(Scene s) {
     }
    public void showWelcome() {

        setView(new WelcomeScreen(this).getView());
    }
    public void showChoice(){
        setView(new ChoiceScreen(this).getView());
    }
     public void showDecryptionScreen(){
         setView(new DecryptionScreen(this).getView());
     }
     public void showEncrypt() {
        setView(new EncryptInputScreen(this).getView());
    }
    public void showOutput(String result) {
        setView(new OutputScreen(this, result).getView());
    }

    public void showDecrypt() {
        setView(new DecryptInputScreen(this).getView());
    }
    public void showExit() {
        setView(new ExitScreen(this).getView());
    }
    public void showCredits() {
        setView(new CreditsScreen(this).getView());
    }

     private void setView(Parent root) {
         if (primaryStage.getScene() == null) {
             primaryStage.setScene(new Scene(root, 600, 400));
         } else {
             primaryStage.getScene().setRoot(root);
         }
 }

     }