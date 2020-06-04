package com.tish;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Account {
  @FXML
  TextField accountLoginField;
  @FXML
  TextField accountPassField;

  @FXML
  TextField newALoginField;
  @FXML
  TextField newAPassField;


  String accountFile;
  String[] accountData;
  Stage window = new Stage();
  Parent root;
  Scene scene;

  public Account() {
  }

  @FXML
  public void changeADButtonClicked() throws IOException {
    root = FXMLLoader.load(getClass().getResource("ChangeAccountPage.fxml"));
    scene = new Scene(root);
    window.setScene(scene);
    window.setTitle("MySecurity");
    window.setResizable(false);
    window.show();
  }

  @FXML
  public void newASaveButtonClicked() throws IOException {
    String accountFile = "София 12345678";
    String newAccountData = newALoginField.getText().concat(" ").concat(newAPassField.getText());
    String line;
    List<String> fileD = new ArrayList<>();
    FileReader reader = new FileReader("Accounts.txt");
    BufferedReader bufferedReader = new BufferedReader(reader);
    while ((line = bufferedReader.readLine()) != null) {
      fileD.add(line);
    }
    for (int i = 0; i < fileD.size(); i++) {
      if (fileD.get(i).equals(accountFile)) {
        fileD.set(i, newAccountData);
        break;
      }
    }
    reader.close();
    FileWriter writer1 = new FileWriter("Accounts.txt");
    writer1.write("");
    FileWriter writer = new FileWriter("Accounts.txt", true);
    for (int i = 0; i < fileD.size(); i++) {
      writer.write(fileD.get(i).concat("\n"));
    }
    writer1.close();
    writer.close();
  }


  @FXML
  public void viewADButtonClicked() throws IOException {
    setAccount();
  }

  public void setAccount() throws IOException {
    FileReader reader = new FileReader("Accounts.txt");
    BufferedReader bufferedReader = new BufferedReader(reader);
    accountFile = bufferedReader.readLine();
    reader.close();
    bufferedReader.close();
    accountData = accountFile.split(" ");
    accountLoginField.setText(accountData[0]);
    accountPassField.setText(accountData[1]);
  }

}
