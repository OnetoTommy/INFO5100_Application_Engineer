    package edu.neu.mgen;
    import java.util.Scanner; //input values for variables

    // HelloWorld
    /*
    * It is my first Java program.
    */

    public class HelloWorld 
    {
        public static void main(String[] args) 
        {
            // Declare and initialize variables of types
            int intVar1 = 1;
            int intVar2 = 2;
            long longVar1 = 3;
            long longVar2 = 4;
            double doubleVar1 = 1.5;
            double doubleVar2 = 2.225;
            boolean boolVar1 = true;
            boolean boolVar2 = false;
            char charVar1 = 'A';
            char charVar2 = 'C';

            // Convert initialized variables of type "int" to "long"
            long convertlong1 = intVar1;
            long convertlong2 = intVar2;

            System.out.println("convertlong1 =" + convertlong1);
            System.out.println("convertlong2 =" + convertlong2);

            // Convert initialized variables of type "long" to "int"
            int convertInt1 = (int) longVar1;
            int convertInt2 = (int) longVar2;

            // Input float values
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter two float values ");
            float floatVar1 = scanner.nextFloat();
            float floatVar2 = scanner.nextFloat();

            // Input boolean
            System.out.println("Please enter true or flase ");
            boolean boolVar3 = scanner.nextBoolean();

            // Run the program for various arithmetic and logic operation
            double doubleVar3 = 0;
            if (boolVar3) 
            {
                doubleVar3 = floatVar1 + floatVar2;
            }else
            {
                doubleVar3 = floatVar1 - floatVar2;
            }

            //Print doubleVar3 result
            System.out.println("doubleVar3 =" + doubleVar3);
        
            // System.out.println("It is my first Java program");
        }
    }

