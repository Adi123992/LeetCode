package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.Scanner;

public class SumOfEven {
    //optimized solution O(1): n*(n+1)
    //but with recursion TC,SC: O(n)
    //
    public static int evenSum(int n) {
        if (n == 0) {
            return 0;
        }
        //as per observation ( observe the pattern, write it and understand the pattern)
        return 2 * n + evenSum(n - 1);
    }

    //formula = n2
    //TC,SC: O(n)
    public static int oddSum(int n) {
        if (n == 1) return 1;
        return (2 * n - 1) + oddSum(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println("Sum of first " + n + " even number is : " + evenSum(n));
        System.out.println("Sum of first " + n + " odd number is : " + oddSum(n));
    }
}
