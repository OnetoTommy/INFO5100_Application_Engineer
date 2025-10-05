
import java.util.ArrayList;

public class HW5_Code
{

    public static void main(String[] args) 
    {
       
        // Given String str = “Oakland”;

        String str = "Oakland";
        System.out.println(str.length());
        System.out.println(str.charAt(2));
        System.out.println(str.substring(3));
        System.out.println(str.toUpperCase());

        /*
         * 2) Given int[] abc = {1,3,5,2,5}; Write a code to
         * find the length of the array
         * find the last member of the array.
         */

         int[] abc = {1,3,5,2,5};
         System.out.println(abc.length);
         System.out.println(abc[abc.length-1]);

        /*
        Create an ArrayList that consists of the following strings: “Austin”, “Houston”, “Oakland”, “Paris”
        “San Francisco”, “Seattle”. Remove “Paris’ from the ArrayList.
         */ 

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Austin");
        arrayList.add("Houston");
        arrayList.add("Oakland");
        arrayList.add("Paris");
        arrayList.add("San Francisco");
        arrayList.add("Seattle");

        // Print the ArrayList before removing "Paris"
        System.out.println("Before removing Paris: " + arrayList);

        arrayList.remove(3);

        // Print the ArrayList after removing "Paris"
        System.out.println("After removing Paris: " + arrayList);
    }
}