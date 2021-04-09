package ferreira;

import java.util.Scanner;

public class MoneyBillCalculator {

        public static int[] withdraw(int amount) {

//            //Value Manipulation
//            int tempValue = amount;
//
//            //Create the array to hold the result set
//           int[] bills = {0, 0, 0};
//
//            //100 case
//            while(tempValue >= 100){
//                bills[0] = bills[0] + 1;
//                tempValue = tempValue - 100;
//            }
//
//            //50 case
//            while(tempValue >= 50 && ((tempValue % 20) != 0)){
//                bills[1] = bills[1] + 1;
//                tempValue = tempValue - 50;
//            }
//
//            if ((tempValue % 20) == 0) {
//                bills[2] = tempValue / 20;
//            }
//
//            System.out.println(tempValue);
//            System.out.println(bills[0]);
//            System.out.println(bills[1]);
//            System.out.println(bills[2]);

            //20 case

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
