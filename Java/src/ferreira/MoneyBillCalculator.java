package ferreira;

import java.util.Scanner;

public class MoneyBillCalculator {

        public static int[] withdraw(int amount) {

            int[] bills = { 100, 50, 20};

            int[] noteCounter = { 0, 0, 0 };

            // count notes using Greedy approach
            for (int i = 0; i < 3; i++) {
                if (amount >= bills[i]) {
                    noteCounter[i] = amount / bills[i];
                    amount = amount - noteCounter[i] * bills[i];
                    noteCounter[i]++;
                }
            }

            System.out.println(bills[0]);
            System.out.println(bills[1]);
            System.out.println(bills[2]);
            return bills;
        }

    public static void main(String[] args) {
        withdraw(200);
    }
}
