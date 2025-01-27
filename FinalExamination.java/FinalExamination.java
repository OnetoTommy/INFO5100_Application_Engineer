package edu.neu.mgen.FinalExamination.java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileWriter;

public class FinalExamination {
  public static void main(String[] args) {
    String filePath = "/Users/xinggchen/Documents/myFile.txt";
    

    try{
      FileReader fileReader = new FileReader(filePath);
      Scanner myReader = new Scanner(fileReader);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println("Reading file content is " + data);
        
      }
    }catch(FileNotFoundException e) {
      System.out.println("Alert");
      e.printStackTrace();
    }
  }

}

// class ReadWriteFile{

//   public void ReadWriteFile(){

//     String filePath = "/Users/xinggchen/Documents/myFile.txt";
    

//     try{
//       FileReader fileReader = new FileReader(filePath);
//       Scanner myReader = new Scanner(fileReader);
//       while (myReader.hasNextLine()) {
//         String data = myReader.nextLine();
//         System.out.println("Reading file content is " + data);
        
//       }
//     }catch(FileNotFoundException e) {
//       System.out.println("Alert");
//       e.printStackTrace();
//     }
//   }
// }