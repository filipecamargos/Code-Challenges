package ferreira;
import java.util.*;

public class Anagrams {

    //Drive the program
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    //Solution without using abstract types
    static boolean isAnagram(String a, String b) {
        //Check based on size
        if(a.length() != b.length()) {
            return false;
        }

        // Complete the function
        char[] A = a.toLowerCase().toCharArray();
        char[] B = b.toLowerCase().toCharArray();

        //Using Sort here O(n log(n))
        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);

        if(java.util.Arrays.equals(A, B)){
            return true;
        }

        return false;
    }

    //Solution using Map

}


