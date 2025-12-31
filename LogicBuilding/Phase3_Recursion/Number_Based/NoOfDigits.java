package LogicBuilding.Phase3_Recursion.Number_Based;

import java.util.Scanner;

public class NoOfDigits {
    public static int digits(int n) {
        //TC: O(digits) and SC: O(digits) call stack
        if (n == 0) {
            return 0;
        }
        return 1 + digits(n / 10);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        if (n == 0) {
            System.out.println("1");
        } else
            System.out.println(digits(n));
    }
}
