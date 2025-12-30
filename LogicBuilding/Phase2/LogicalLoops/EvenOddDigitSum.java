package LogicBuilding.Phase2.LogicalLoops;

import java.util.Scanner;

public class EvenOddDigitSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //time complexity is number of digits O(n), space complexity : O(1)
        int n = s.nextInt();
        int temp = n;
        int evend = 0, oddd = 0;
        while (n != 0) {
            int rem = n % 10;
            if (rem % 2 == 0) evend += rem;
            else oddd += rem;
            n /= 10;
        }
        System.out.println("Even Digit Sum : " + evend);
        System.out.println("Odd Digit Sum : " + oddd);

    }
}
