package edu.neu.mgen;

import java.io.BufferedReader;
import java.io.File; // Import the File class
import java.io.FileWriter;
import java.io.FileNotFoundException; // Import this class to handle errors
import java.io.FileReader;
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException; // Import the IOException class to handle errors

// public class ReadFile {
//   public static void main(String[] args) {
//     try {
//       File myObj = new File("filename.txt");
//       Scanner myReader = new Scanner(myObj);
//       while (myReader.hasNextLine()) {
//         String data = myReader.nextLine();
//         System.out.println(data);
//       }
//       myReader.close();
//     } catch (FileNotFoundException e) {
//       System.out.println("An error occurred.");
//       e.printStackTrace();
//     }
//   }
// }

public class ReadWriteFile {
  // Read this file from your Java program and print the phrase in the Java
  // terminal.
  public static void main(String[] args) {
    String filePath = "/Users/xinggchen/Documents/my_test_file.txt";
    try {
      File readFile = new File(filePath);
      Scanner myReader = new Scanner(readFile);
      while (myReader.hasNextLine()) {
        String textString = myReader.nextLine();
        System.out.println(textString);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Alert");
      e.printStackTrace();
    }
    // Enter phrase “Java write test” into your Java program from the Java terminal.
    System.out.println("Please enter 'Java write test'");
    Scanner scanner = new Scanner(System.in);
    String enterSentence = scanner.nextLine();

    try {
      FileWriter writeFile = new FileWriter(filePath, true);
      writeFile.write(System.lineSeparator());
      writeFile.write(enterSentence);
      System.out.println("Successfully write sentence.");
      writeFile.close();
    } catch (IOException e) {
      System.out.println("Write sentence failed");
      e.printStackTrace();
    }

    // Step 4: Confirm that the new content has been written by reading the file
    // again
    System.out.println("\nReading updated content from the file:");
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Error reading the updated file.");
      e.printStackTrace();
    }

  }
}