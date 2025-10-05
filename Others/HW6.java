package edu.neu.mgen;
import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;


public class HW6 {

    public static void main(String[] args) {

        // Enter word according to Scanner
        Scanner sc = new Scanner(System.in);
        LocalTime startDate = LocalTime.now();
        System.out.println("Please enter any word: ");
        String enterWord = sc.nextLine();
        LocalTime endDate = LocalTime.now();

        int wordLength = enterWord.length();

        // Timing during entering process
        Duration duration = Duration.between(startDate, endDate);
        long timeElapsed = duration.getSeconds();

        System.out.println("Word Length: " + wordLength);
        System.out.println("Elapsed Seconds= " + timeElapsed);

        String lengthType = "";
        if (enterWord.isEmpty()) {
            System.out.println("You did not enter any word");

        } else{
            if (wordLength <= 5) {
                lengthType = "short"; 
            } else if(wordLength > 5 && wordLength <= 10) {
                lengthType = "medium"; 
            }else{
                lengthType = "long";
            }

            System.out.println("Your word is" + enterWord);
            System.out.println("It is a " + lengthType + " word");
            System.out.println("The length of the word is " + wordLength);
            System.out.println("Your reaction time is " + timeElapsed + " seconds");
        }

    }
    
}
