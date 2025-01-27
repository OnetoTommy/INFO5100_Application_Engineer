package edu.neu.mgen;


public class HW8 {

    public static void main(String[] args) {
        /*
         * Develop the following program:
          {“Anne”, “John”, “Alex”, “Jessica”}. 
          Create a method that returns a new array that consists of all elements of the original array in the inverse order.
          Each element (string) in the resultant array is written backward compared to the original string (as the inverse words) 
          example “abc” -> “cba”.
          Each element (string) in the resultant array starts with the capital letter, and all other letters are lower case.
          The main program calls the created methods that prints the original and resultant arrays as shown below:
         */
        // Create orginalArrays
         String[] orginalArrays = {"Sun", "Mercury", "Venis", "Earth", "Mars", "Jupiter"};  
         
        //Print original array
         System.out.println("Original array:");
         for(int i = 0; i < orginalArrays.length; i++){
            System.out.println(orginalArrays[i]);
         }
         System.out.println("End of the array");

        //  Using a reversedOrder method
        String[] reversedArrays = reversedOrder(orginalArrays);

        // Print Resultant array
        System.out.println("Resultant array:");
        for(int i = 0; i < reversedArrays.length; i++){
            System.out.println(reversedArrays[i]);
         }
         System.out.println("End of the array");

    }

    public static String[] reversedOrder (String[] array){

        String[] inverseArray = new String[array.length];

        for(int i = 0; i < array.length; i++){
            
            String word = array[array.length -1 - i];

            char[] charArray = word.toCharArray();
            int left = 0;
            int right = word.length() - 1;

            while (left < right) {
                char temp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = temp;
                left++;
                right--;
            }
            // Inverse word from charArray to String word
            String reversedWord = new String(charArray);
            // Add reversed word into inverd array
            inverseArray[i] = reversedWord.substring(0, 1).toUpperCase() + 
            reversedWord.substring(1).toLowerCase();
        }

        return inverseArray;
    }

}
    

