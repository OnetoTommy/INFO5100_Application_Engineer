package edu.neu.mgen;

public class Lab1_Part1 {
    public static void main(String[] args) {
        /*
         * Array
         */
        // Create Arrays
        int[] x = { 1, 12, 3, 19, 5 };
        int[] y = { 6, 7, 8, 9, 10 };
        int[] z = new int[5];

        // Selct the max of the respective numbers of x and y
        for (int i = 0; i < x.length; i++) {
            z[i] = Math.max(x[i], y[i]);
        }

        // // Verfy Array z
        // for (int j = 0; j < x.length; j++) {
        //     System.out.println(z[j]);
        // }

        System.out.println("Array x = " + getArray(x) + "\n");
        System.out.println("Array y = " + getArray(y) + "\n");
        System.out.println("Array z = " + getArray(z) + "\n");
    }

    public static String getArray(int[] array){
        StringBuilder arrayBuilder = new StringBuilder();
        arrayBuilder.append("{");
        for (int i = 0; i < array.length; i++) {
            arrayBuilder.append(array[i]);
            if (i < array.length - 1){
                arrayBuilder.append(",");
            }

        }
        arrayBuilder.append("}");

        return arrayBuilder.toString();

    }

}
