package LogicBuilding.Phase3_Recursion.Foundation;

import java.util.Scanner;

public class SumOfDigits {
    public static int sumOfDigits(int n) {
        //the base condition
        if (n == 0) {
            return 0;
        }
        //TC: O(digits) , SC: O(digits) call stack
        return n % 10 + sumOfDigits(n / 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Sum of digits of " + n + " is : " + sumOfDigits(n));
    }
}
