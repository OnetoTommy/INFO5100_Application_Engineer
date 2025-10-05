package edu.neu.mgen;

public class HW11_Code {

  public static void main(String[] args) {

    // try...catch
    try {
      int[] myNumbers = { 15, 22, 31, 5, 7, 10 };
      System.out.println(myNumbers[10]);
    } catch (Exception e) {
      System.out.println("Index out of bounds: " + e.getMessage());
    }

  }
}
