package ferreira;

import java.util.*;

/**
 * Given a string, write a method that return the reverse of it
 * Do not use any algorithm that has over linear time complexity
 */
public class ReverseString {

    //Drive code
    static public void main(String[] Args) {

        List<String> stringList = new ArrayList<>();

        stringList.add("test");
        stringList.add("Maria Duart");
        stringList.add("Hello World");
        stringList.add("Bob");
        stringList.add("reversed");

        for(String n : stringList) {
            reverseString(n);
        }
    }

    /**
     * Reverse the passed string
     * @param n for the string to be reversed
     */
    static private void reverseString(String n) {

        //Create a String Builder to manipulate the char
        StringBuilder reversed = new StringBuilder(n);

        //Loop thought and a reversed order to assigned the proper values
        int backWard = n.length() - 1;

        for (int forWard = 0; forWard < n.length(); forWard++, backWard--) {
            reversed.setCharAt(forWard, n.charAt(backWard));
        }

        //Display the new String
        System.out.println(n + " : " + reversed.toString());
    }
}
