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
        boolean retSec = isAnagramUsingMap(a, b);

        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
        System.out.println( (retSec) ? "Anagrams" : "Not Anagrams" );
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

    //Solution using Map with Linear Time
    static boolean isAnagramUsingMap(String a, String b){
        //Check based on size
        if(a.length() != b.length()) {
            return false;
        }

        //Create a Map to hold key and value
        Map<Character, Integer> frequencyMapA = new HashMap<>();
        Map<Character, Integer> frequencyMapB = new HashMap<>();

        //Map the char with the number of times they show up
        for(int i = 0; i < a.length(); i++){

            //set the case for A
            if(frequencyMapA.containsKey(a.toLowerCase().charAt(i))) {
                int value = frequencyMapA.get(a.toLowerCase().charAt(i)) + 1;
                frequencyMapA.put(a.toLowerCase().charAt(i), value);
            } else {
                frequencyMapA.putIfAbsent(a.toLowerCase().charAt(i), 1);
            }

            //set the case for B
            if(frequencyMapB.containsKey(b.toLowerCase().charAt(i))) {
                int value = frequencyMapB.get(b.toLowerCase().charAt(i)) + 1;
                frequencyMapB.put(b.toLowerCase().charAt(i), value);
            } else {
                frequencyMapB.putIfAbsent(b.toLowerCase().charAt(i), 1);
            }
        }

        if(frequencyMapA.equals(frequencyMapB)) {
            return true;
        }

        return false;
    }
}


