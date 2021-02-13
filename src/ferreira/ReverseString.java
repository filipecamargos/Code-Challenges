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

        //With Array
        for(String n : stringList) {
            reverseString(n);
        }

        System.out.println("______________________________________");

        //With Stack
        for(String n : stringList) {
            reverStringStack(n);
        }
    }

    /**
     * Reverse the passed string
     * @param n for the string to be reversed
     */
    static private void reverseString(String n) {

        //Create a String Builder to manipulate the char
        char[] reversed = n.toCharArray();

        //Loop thought and a reversed order to assigned the proper values
        int backWard = n.length() - 1;

        for (int forWard = 0; forWard < n.length(); forWard++, backWard--) {
            reversed[forWard] = n.charAt(backWard);
        }

        //Display the new String
        System.out.println(n + " : " + String.valueOf(reversed));
    }

    /***
     * Using a stack
     */
    static public void reverStringStack(String n) {

        //Create a String Builder to manipulate the char
        char[] reversed = n.toCharArray();

        //Declare a Stack to be manipulated
        Stack<Character> stackChar = new Stack<>();

        //Populate the stack
        for(int i = 0; i < n.length(); i++) {
            stackChar.push(reversed[i]);
        }

        //Pop on each iteration
        for(int i = 0; i < n.length(); i++) {
            reversed[i] = stackChar.pop();
        }

        System.out.println(n + " : " + String.valueOf(reversed));
    }
}
