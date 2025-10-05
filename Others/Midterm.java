package edu.neu.mgen;

public class Midterm {

    public static void main(String[] args) {
        // create array
        int[][] arrayNumber = {{1,2,3}, {4,5,6}};

        // for loop
        int sum = 0;
        for (int i = 0; i < arrayNumber.length; i++){
            for(int j = 0; j < arrayNumber[i].length; j++){
                sum += arrayNumber[i][j];
            }
        }
        // print sum result
        System.out.println("Sum of all elements are " + sum);

    }
}
