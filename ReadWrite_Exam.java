package edu.neu.mgen;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.rmi.server.SocketSecurityException;

public class ReadWrite_Exam {
  public static void main(String[] args) {

    new ReadWriteFile01();
    new WriteFile01();
    // String filePath = "/Users/xinggchen/Documents/myFile.txt";

    // // Read file content
    // try{
    // FileReader fileReader = new FileReader(filePath);
    // Scanner myReader = new Scanner(fileReader);
    // while (myReader.hasNextLine()) {
    // String data = myReader.nextLine();
    // System.out.println("Reading file content is " + data);
    // }
    // myReader.close();
    // }catch(FileNotFoundException e) {
    // System.out.println("Alert");
    // e.printStackTrace();
    // }

    // // Enter phrase “Java write test” into your Java program from the Java
    // terminal.
    // System.out.println("Please enter 'A new string'");
    // Scanner scanner = new Scanner(System.in);
    // String enterSentence = scanner.nextLine();
    // scanner.close();

    // // Write content into file
    // try{
    // FileWriter writeFile = new FileWriter(filePath, true);
    // writeFile.write(System.lineSeparator());
    // writeFile.write(enterSentence);
    // System.out.println("Successfully write sentence.");
    // writeFile.close();
    // }catch (IOException e) {
    // System.out.println("Write sentence failed");
    // e.printStackTrace();
    // }

  }
}

class ReadWriteFile01 {

  public ReadWriteFile01() {

    String filePath = "/Users/xinggchen/Documents/myFile.txt";
    try {
      FileReader fileReader = new FileReader(filePath);
      Scanner myReader = new Scanner(fileReader);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println("Reading file content is " + data);
      }
      myReader.close();
      fileReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Alert");
      e.printStackTrace();
    } catch (IOException e) {
      System.out.println("IOException occurred.");
      e.printStackTrace();
    }
  }
}

class WriteFile01 {
  public WriteFile01() {
    String filePath = "/Users/xinggchen/Documents/myFile.txt";
    System.out.println("Enter string.");
    Scanner sc = new Scanner(System.in);
    String wordString = sc.nextLine();
    sc.close();

    try {
      FileWriter fileWriter = new FileWriter(filePath, true);
      fileWriter.write(System.lineSeparator());
      fileWriter.write(wordString);
      System.out.println("Successfully");
      fileWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}