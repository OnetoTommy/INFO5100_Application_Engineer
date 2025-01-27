package edu.neu.mgen;
import java.util.Scanner;
import java.time.LocalTime; 
import java.time.Duration;

public class HW6_Code {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalTime startTime = LocalTime.now();
        System.out.println("Enter any word: "); 
        String enter_WordString = scanner.nextLine();
        LocalTime endtTime = LocalTime.now();
        System.out.println("You entered: " + enter_WordString);

        // Count string length
        int length = enter_WordString.length();

        // Duration between start time and end time
        Duration duration = Duration.between(startTime, endtTime);
        long timeElapsedSeconds = duration.getSeconds();

        System.out.println("Length: " + length);
        System.out.println("Elapsed Seconds= " + timeElapsedSeconds);

        String leType = "";
        if (enter_WordString.isEmpty()) {
            System.out.println("You did not enter any word");

        } else{
            if (length <= 5) {
                leType = "short"; 
            } else if(length > 5 && length <= 10) {
                leType = "medium"; 
            }else{
                leType = "long";
            }

            System.out.println("Your word is" + enter_WordString);
            System.out.println("It is a " + leType + " word");
            System.out.println("The length of the word is " + length);
            System.out.println("Your reaction time is " + timeElapsedSeconds + " seconds");
        }
        }
        
    }
    

