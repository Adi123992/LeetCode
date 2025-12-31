package LogicBuilding.Phase2_Loops_Patterns.LogicalLoops;

import java.util.Scanner;

public class SmallestLargestDigit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int max = 0;
        int min = 9;
        if (n == 0) {
            System.out.println("Maximum digit is: 0");
            System.out.println("Minimum digit is: 0");
            return;
        }

        while (n != 0) {
            int rem = n % 10;
            if (max < rem) {
                max = rem;
            }
            if (min > rem) {
                min = rem;
            }
            n /= 10;
        }
        System.out.println("The Maximum digit is : " + max);
        System.out.println("The Minimum digit is : " + min);
    }
}
