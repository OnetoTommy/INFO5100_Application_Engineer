package edu.neu.mgen;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

// public class WriteToFile {
//   public static void main(String[] args) {
//     try {
//       FileWriter myWriter = new FileWriter("filename.txt");
//       myWriter.write("Files in Java might be tricky, but it is fun enough!");
//       myWriter.close();
//       System.out.println("Successfully wrote to the file.");
//     } catch (IOException e) {
//       System.out.println("An error occurred.");
//       e.printStackTrace();
//     }
//   }
// }

public class WriteFile{
  public static void main(String[] args) {
    try{
      FileWriter myWriteFile = new FileWriter("filename.txt");
      myWriteFile.write("\nNEU is one of the most popular universities all over the world.");
      System.out.println("\nSuccessfully write sentence into the filename.");
      myWriteFile.close();
    }catch(IOException e){
      System.out.println("Alert");
      e.printStackTrace();
    }
  }
}


