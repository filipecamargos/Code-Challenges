package ferreira;

import java.util.ArrayList;

//Implement an algorithm to determine if a string has all unique characters.
public class UniqueCharacters {

    public static void main(String[] args) {

        //Strings to be tested
        ArrayList<String> stringArray = new ArrayList<>();

        stringArray.add("Hellow World");
        stringArray.add("ADBCDE");
        stringArray.add("abscdb");
        stringArray.add("abc abd abb");
        stringArray.add("nightmare");
        stringArray.add("Test");
        stringArray.add("This won gral");
        stringArray.add("Aa Bb Cc");

        for (String n : stringArray) {
            testCaseMethod(n);
        }
    }

    private static void testCaseMethod(String n) {
        //Code to test Strings

        //Remove the white spaces
        String text =  n.replaceAll("\\s", "");

        for(int i = 0; i < text.length(); i ++) {
            for (int j = 0; j < text.length(); j++) {
                if ((i != j) && (text.charAt(i) == text.charAt(j))){
                    System.out.println( n + ": Not all unique characters");
                    System.out.println(text.charAt(i) + " " + text.charAt(j));
                    return;
                }
            }
        }

        System.out.println(n + ": All unique characters");
    }
}
