package ferreira;

import java.util.*;

/**
 * Make a function returns true if the provided string is
 * a palindrome, and false otherwise.
 */
public class StringPalindrome {

    /**
     * Driven Code
     * @param args
     */
    public static void main(String[] args) {

        //ArrayList to hold the String to be tested
        ArrayList<String> stringToTest = new ArrayList<>();

        stringToTest.add("CAT");
        stringToTest.add("Anna");
        stringToTest.add("Hih");
        stringToTest.add("nop");
        stringToTest.add("MaDaM");

        //Call the method and iterate through the List
        for(String n : stringToTest) {
            System.out.println("Is " + n + " a palindrome? " + isPalindrome(n) +
                    "\n---------------------------------------------------------");
        }
    }

    /**
     * Check if a word is Palindrome
     */
    public static boolean isPalindrome(String n) {

        //First thing is to lowercase the string so it proper to compare
        String check = n.toLowerCase();

        //Loop through the string to check if is the same backwards
        int backWards = n.length() - 1;

        for(int foward = 0; foward < n.length(); foward++, backWards--) {
            if (check.charAt(foward) != check.charAt(backWards)) {
                return false;
            }
        }

        return true;
    }

    /**
     * Check if a word is a Palindrome using other data types
     */

}
