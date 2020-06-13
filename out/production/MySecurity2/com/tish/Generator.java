package com.tish;

public class Generator {

  public Generator() {
  }

  public static String generation(String isSelected) {
    String pass = "";
    if (isSelected.equals("pass")) {
      int number = (int) (Math.random() * 8 + 13);
      pass = passGenerator(number);
    } else if (isSelected.equals("pain"))
      pass = String.valueOf(pinGenerator());
    return pass;

  }

  private static String passGenerator(int length) {
    String pass = "";
    char c;
    for (int i = 0; i < length; i++) {
      c = (char) ((int) (Math.random() * 33 + 94));
      pass = pass.concat(String.valueOf(c));
    }
    return pass;
  }

  private static int pinGenerator() {
    return (int) (Math.random() * 1000 + 9000);
  }
}
