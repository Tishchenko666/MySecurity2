package com.tish;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Welcome {
  Stage window = new Stage();
  Parent root;
  Scene scene;
  public Welcome() {
  }

  void WindowCreate(String buttonName) throws IOException {
    switch (buttonName) {
      case "Генерация пароля":
        root = FXMLLoader.load(getClass().getResource("GuestGenerationPage.fxml"));
        scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("MySecurity");
        window.setResizable(false);
        window.show();
        break;
      case "Регистрация":
        root = FXMLLoader.load(getClass().getResource("RegistrationPage.fxml"));
        scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("MySecurity");
        window.setResizable(false);
        window.show();
        break;
      case "Вход":
        root = FXMLLoader.load(getClass().getResource("EnterPage.fxml"));
        scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("MySecurity");
        window.setResizable(false);
        window.show();
        break;
      case "Войти в аккаунт":
        root = FXMLLoader.load(getClass().getResource("UserPage.fxml"));
        scene = new Scene(root);
        window.setScene(scene);
        window.setTitle("MySecurity");
        window.setResizable(false);
        window.show();
        break;
    }
  }


}
