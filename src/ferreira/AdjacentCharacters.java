package ferreira;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Alternating Characters Challenge HackerRank
 * Link: https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class AdjacentCharacters {
    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {

        char[] a = s.toCharArray();
        int count = 0;
        char r = 'x';

        for (int i = 0; i < s.length(); i++){
            if ((i + 1) < s.length()) {
                if (a[i] == a[i + 1]){
                    a[i] = r;
                }
            }
        }

        for (int i = 0; i < s.length(); i++){
            if (a[i] == r){
                count++;
            }
        }

        return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
