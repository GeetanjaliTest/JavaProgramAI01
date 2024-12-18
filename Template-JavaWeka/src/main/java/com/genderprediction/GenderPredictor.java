package com.genderprediction;

import java.util.Scanner;

public class GenderPredictor {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter a name to predict its gender: ");
    String name = scanner.nextLine().trim();

    // Call the gender prediction method
    String gender = NameGenderPredictor.predictGender(name);

    System.out.println("Predicted gender for the name '" + name + "' is: " + gender);
  }
}
