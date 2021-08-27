package ferreira;
import java.util.Scanner;
/*
Lexicographical Order Challenge
Reference: https://www.hackerrank.com/challenges/java-string-compare/problem
 */
public class SubstringLexicographicalOrder {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'

        //Instatiate with the first subString of s
        smallest = s.substring(0, k);

        //Loop though the whole string
        for(int i = 0; i <  s.length(); i++) {

            //Check so we don't go over the string
            if(i + k <= s.length()) {

                //if smallest wich starts with the first subString of s
                // is smaller by using the compareTo then resigned
                if (smallest.compareTo(s.substring(i, i + k)) > 0){
                    smallest = s.substring(i, i + k);
                }
                //Peforme the same but for the larger
                if (largest.compareTo(s.substring(i, i + k)) < 0) {
                    largest = s.substring(i, i + k);
                }
            }
        }


        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}

