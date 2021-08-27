package ferreira;
import java.text.NumberFormat;
import java.util.*;

//Currency Format Challenge: https://www.hackerrank.com/challenges/java-currency-formatter/problem
public class CurrencyFormating {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double payment = scanner.nextDouble();
            scanner.close();

            //Create number Format
            NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

            //Display for US
            System.out.println("US: " + nf.format(payment));
            //Display for India Since inda does not show we get the local
            nf = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
            System.out.println("India: " + nf.format(payment));

            //Display for China
            nf = NumberFormat.getCurrencyInstance(Locale.CHINA);
            System.out.println("China: " + nf.format(payment));

            //Display for France
            nf = NumberFormat.getCurrencyInstance(Locale.FRANCE);
            System.out.println("France: " + nf.format(payment));
        }
}

