package edu.neu.mgen;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;

class ReadFile {
  private String path;

  public ReadFile(String path) {
    this.path = path;
  }

  // Method to read file content and print to console
  public void getReadFile() {
    try {
      File readFile = new File(path);
      Scanner myReader = new Scanner(readFile);
      while (myReader.hasNextLine()) {
        System.out.println(myReader.nextLine());
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Alert: File not found.");
      e.printStackTrace();
    }
  }
}

class WriteFile {
  private String path;
  private String enterString;

  // public WriteFile(String path, String enterString) {
  // this.path = path;
  // this.enterString = enterString;
  // }

  public void setParams(String path, String enterString) {
    this.path = path;
    this.enterString = enterString;
  }

  // Method to write content to the file
  public void getWriteFile() {
    try {
      FileWriter writeFile = new FileWriter(path, true);
      writeFile.write(System.lineSeparator());
      writeFile.write(enterString);
      System.out.println("Successfully write sentence.");
      writeFile.close();
    } catch (IOException e) {
      System.out.println("Write sentence failed");
      e.printStackTrace();
    }
  }
}

public class HW12_Code {  public static void main(String[] args) {
    String path = "/Users/xinggchen/Documents/my_test_file.txt";

    // Read file content
    ReadFile readFile = new ReadFile(path);
    readFile.getReadFile();

    // Prompt user for input
    System.out.println("Enter \"Java write test\" ");
    Scanner sc = new Scanner(System.in);
    String enterSentence = sc.nextLine();

    WriteFile writeFile = new WriteFile();
    writeFile.setParams(path, enterSentence);
    writeFile.getWriteFile();
    sc.close();

    // Write the input to the file
    // try {
    // FileWriter writeFile = new FileWriter(path, true);
    // writeFile.write(System.lineSeparator());
    // writeFile.write(enterSentence);
    // System.out.println("Successfully write sentence.");
    // writeFile.close();
    // } catch (IOException e) {
    // System.out.println("Write sentence failed");
    // e.printStackTrace();
    // }

  }
}
