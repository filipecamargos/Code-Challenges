package ferreira;
import java.util.*;

/* HackerRank Problem with Loops
    https://www.hackerrank.com/challenges/java-loops/problem
 */
public class MathBasicProblem01 {

    public static void main(String []argh){

        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int result = 0;

        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            result = a + 1 * b;
            int expo = 2;
            System.out.print(result + " ");

            for(int j = 1; j < n; j++){
                result += expo * b;
                expo *= 2;
                System.out.print(result + " ");
            }

            System.out.println();
        }
        in.close();
    }

}
