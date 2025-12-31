package LogicBuilding.Phase2_Loops_Patterns.MathsLogic;

import java.util.Scanner;

//Check if a number is a strong number (sum of factorials of digits = number).
public class StrongNum {
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        while (n != 0) {
            int rem = n % 10;
            sum += factorial(rem);
            n /= 10;
        }
        if (sum == temp) System.out.println(temp + " is a Strong number.");
        else System.out.println(temp + " is not a Strong number.");
    }
}
