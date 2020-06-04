package com.tish;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

  @Override
  public void start(Stage primaryStage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource("WelcomePage.fxml"));
    Scene scene = new Scene(root);
    primaryStage.setScene(scene);

    primaryStage.setTitle("MySecurity");
    primaryStage.setResizable(false);

    primaryStage.show();
  }

  @FXML
  public void guestGenrButtonClicked() throws IOException {
    Welcome nextStep = new Welcome();
    nextStep.WindowCreate("Генерация пароля");
  }

  public void guestRegistrButtonClicked() throws IOException {
    Welcome nextStep = new Welcome();
    nextStep.WindowCreate("Регистрация");
  }

  public void guestEnterButtonClicked() throws IOException {
    Welcome nextStep = new Welcome();
    nextStep.WindowCreate("Вход");
  }

  public static void main(String[] args) {
    launch(args);
  }


}
