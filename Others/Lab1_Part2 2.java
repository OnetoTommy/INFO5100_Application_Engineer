package edu.neu.mgen;

import java.util.ArrayList;

public class Lab1_Part2 {

    public static void main(String[] args) {
        // Create ArrayList
        ArrayList<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Lucy");
        names.add("Ebun");
        names.add("Charles");
        names.add("Jose");

        ArrayList<String> switchNames = new ArrayList<>();

        // Switch the first and last letters of each name
        for(String name : names){
            String switchName = switchFirstLastLetter(name);
            switchNames.add(switchName);
        }

        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names = { " + String.join(", ", switchNames) + " }");


        
    }

    public static String switchFirstLastLetter(String nameString) {

        if (nameString.length() <= 1){
            return nameString;
        }
        

        // Extract the first and last letter
        char first = nameString.charAt(0);
        char last = nameString.charAt(nameString.length() - 1);

        // Extract the middle string
        String middle = nameString.substring(1, nameString.length() - 1);

        return Character.toUpperCase(last) + middle.toLowerCase() + Character.toLowerCase(first);

    }
    
}
