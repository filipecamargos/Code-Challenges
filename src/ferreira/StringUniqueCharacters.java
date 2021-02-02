package ferreira;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 */
public class StringUniqueCharacters {

    /**
     * Driven code case
     * @param args
     */
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

        //Easy with Quadratic Complexity O(n'2)
        System.out.println("Quadratic: \n " +
                "------------------------------");
        for (String n : stringArray) {
            testCaseMethodOn2(n);
        }

        // A little more effective O (n log n)
        System.out.println("------------------------------ \n " +
                "n Log n: \n ------------------------------");
        for (String n : stringArray) {
            testCaseMethodnLogn(n);
        }
    }

    /**
     * Quadratic performance to
     * @param n
     */
    private static void testCaseMethodOn2(String n) {

        //Remove the white spaces
        String text =  n.replaceAll("\\s", "");

        //Easy with Quadratic Complexity O(n'2)
        for(int i = 0; i < text.length(); i ++) {
            for (int j = 0; j < text.length(); j++) {
                if ((i != j) && (text.charAt(i) == text.charAt(j))){
                    System.out.println( n + ": Not all unique characters");
                    return;
                }
            }
        }

        System.out.println(n + ": All unique characters");
    }

    /**
     * N log N performance
     * @param n
     */
    private static void testCaseMethodnLogn(String n) {

        //remove spaces
        String text = n.replaceAll("\\s", "");

        //Transform to a char[]
        char[] textChar = text.toCharArray();

        //Sort
        Arrays.sort(textChar);

        //Loop and check
        for(int i = 0; i < text.length() - 1; i++) {
            if (textChar[i] == textChar[i + 1]) {
                System.out.println( n + ": Not all unique characters");
                return;
            }
        }

        System.out.println(n + ": All unique characters");
    }
}
